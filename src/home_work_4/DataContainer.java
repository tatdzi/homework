package home_work_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Comparator;

public class DataContainer<T> implements Iterable<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data =Arrays.copyOf(data,data.length);
    }

    /**
     * В данном классе должен быть метод int add(T item) который добавляет
     * данные во внутреннее поле data и возвращает номер позиции в которую
     * были вставлены данные, начиная с 0.
     *
     * @param item
     * @return
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }

        int indexForInsert = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                indexForInsert = i;
                break;
            }
        }
        if (indexForInsert == -1) {
            indexForInsert = this.data.length;
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        data[indexForInsert] = item;

        return indexForInsert;
    }

    /**
     * В данном классе должен быть метод T get(int index).
     * Данный метод получает из DataContainer'а, из поля data, предварительно
     * сохранённый объект который мы передали на предыдущем шаге через метод add.
     *
     * @param index
     * @return
     */
    public T get(int index) {
        if (!checkIndexExist(index)){
            return null;
        }

        return data[index];
    }


    private  boolean checkIndexExist(int index){
        return index >= 0 && index < this.data.length;
    }

    /**
     * В данном классе должен быть метод T[] getItems().
     * Данный метод возвращает массив из поля data.
     *
     * @return
     */
    public T[] getItems() {
        return Arrays.copyOf(this.data,this.data.length);
    }

    /**
     * Добавить метод boolean delete(T item) который будет
     * удалять элемент из нашего поля data.
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (!checkIndexExist(index)) {
            return false;
        }

        for (int i = index + 1; i < data.length; i++) {
            this.data[i - 1] = this.data[i];
        }

        this.data = Arrays.copyOf(this.data, this.data.length - 1);

        return true;
    }

    public boolean delete(T item) {
        if (item == null) {
            return true;
        }

        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(item, data[i])) {
                return delete(i);
            }
        }

        return false;
    }

    /**
     * Переопределить метод toString() в классе и выводить содержимое
     * data без ячеек в которых хранится null.
     *
     * @return
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        boolean comma = false;
        builder.append("[");
        for (T datum : data) {
            if (datum != null) {
                if (comma) {
                    builder.append(", ");
                } else {
                    comma = true;
                }
                builder.append(datum);
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator).
     * Данный метод занимается сортировкой данных записанных в поле data используя
     * реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
     * Классом Arrays пользоваться запрещено. Интефейс Comparator обязательно должен
     * быть реализован отдельным классом.
     *
     * @param cont
     */

    public void sort(Comparator<T> cont) {
        DataContainer.sort(this,cont);
    }

    /**
     * В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container)
     * с дженериком extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте
     * DataContainer используя реализацию сравнения вызываемый у хранимых объектов.
     * Для этого надо сделать дженерик метод.
     *
     * @param cont
     */
    public static <T> void sort(DataContainer<? extends Comparable> cont) {
        DataContainer.sort(cont,new ComparatorComparable());
    }

    /**
     * В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container,
     * Comparator<.......> comparator) который будет принимать объект DataContainer и реализацию интерфейса
     * Comparator. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя
     * реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.
     *
     * @param cont
     * @param comp
     */
    public static <T> void sort(DataContainer<T> cont, Comparator<? super T> comp) {
        for (int i = 0; i < cont.data.length - 1; i++) {
            for (int j = i + 1; j < cont.data.length; j++) {
                if (comp.compare(cont.data[i], cont.data[j]) > 0) {
                    T a = cont.data[i];
                    cont.data[i] = cont.data[j];
                    cont.data[j] = a;
                }
            }
        }

    }

    /**
     * Реализовать в DataContainer интерфейс Iterable
     *
     * @return
     */
    public Iterator <T> iterator() {
        return new IteratorData();
    }

    private class IteratorData implements Iterator<T> {
        private int index = -1;

        @Override
        public boolean hasNext() {
            return checkIndexExist(index + 1);
        }


        @Override
        public T next() {
            return data[++index];
        }

        public void remove() {
            delete(index);
        }

    }
}