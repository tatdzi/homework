package home_work_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Comparator;

public class DataContainer<T> implements Iterable<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public void increaseArray(){
        T[] data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data = data;
    }
    public void decreaseArray(){
        T[] data = Arrays.copyOf(this.data, this.data.length - 1);
        this.data = data;
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
        } else if (data.length == 0) {
            increaseArray();
            data[data.length - 1] = item;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    return i;
                }
            }
            if (data[data.length - 1] != null) {
                increaseArray();
                data[data.length - 1] = item;
            }
        }
        return data.length - 1;
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
        if (index > data.length - 1) {
            return null;
        } else {
            return data[index];
        }
    }

    /**
     * В данном классе должен быть метод T[] getItems().
     * Данный метод возвращает массив из поля data.
     *
     * @return
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Добавить метод boolean delete(T item) который будет
     * удалять элемент из нашего поля data.
     *
     * @param index
     * @return
     */
    boolean delete(int index) {
        if (index > data.length - 1) {
            return false;
        } else if (data[index] == null) {
            return false;
        } else {
            for (int i = index; i < data.length; i++) {
                if (i<data.length-1) {
                    T t = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = t;
                }else {
                    decreaseArray();
                }
            }
        }
        return true;
    }

    boolean delete(T item) {
        boolean more = true;
        boolean result = false;
        if (item != null) {
            do {
                for (int i = 0; i < data.length; i++) {
                    if (Objects.equals(item, data[i])) {
                        if (i == data.length - 1) {
                            decreaseArray();
                            more = true;
                            result = true;
                        } else {
                            T t = data[i];
                            data[i] = data[i + 1];
                            data[i + 1] = t;
                        }
                    } else {
                        more = false;
                    }
                }
            } while (more);
        }
        return result;
    }

    /**
     * Переопределить метод toString() в классе и выводить содержимое
     * data без ячеек в которых хранится null.
     *
     * @return
     */
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < data.length; i++) {
            if (i == 0) {
                if (data[i] != null) {
                    result += data[i];
                } else {
                    for (int j = i; j < data.length; j++) {
                        if (data[j] != null) {
                            result += data[j];
                            break;
                        }
                    }
                }
            } else if (data[i] != null) {
                result += ", " + data[i];
            }
        }
        result += "]";
        return result;
    }

    /**
     * Переопределить метод toString() в классе и выводить содержимое
     * data без ячеек в которых хранится null.
     *
     * @return
     */
    public String toStringBuilder() {
        StringBuilder builder = new StringBuilder();
        boolean comma = false;
        builder.append("[");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                if (comma) {
                    builder.append(", ");
                } else {
                    comma = true;
                }
                builder.append(data[i]);
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
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (cont.compare(data[i], data[j]) > 0) {
                    T a = data[i];
                    data[i] = data[j];
                    data[j] = a;
                }
            }
        }
    }

    /**
     * В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container)
     * с дженериком extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте
     * DataContainer используя реализацию сравнения вызываемый у хранимых объектов.
     * Для этого надо сделать дженерик метод.
     *
     * @param cont
     */
    public static void sort(DataContainer<? extends Comparable> cont) {
        Comparable[] arr = cont.getItems();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    Comparable a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
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
    public static <Comparable> void sort(DataContainer<? extends Comparable> cont, Comparator<Comparable> comp) {
        Comparable[] arr = cont.getItems();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (comp.compare(arr[i], arr[j]) > 0) {
                    Comparable a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

    }

    public void testIterator() {
        Iterator <T> it = iterator();
        while (it.hasNext()) {
            if (it.next() == null){
                it.remove();
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

    public class IteratorData implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.length;
        }


        @Override
        public T next() {
            return data[index++];
        }

        @Override
        public void remove() {
            for (int i = index-1; i < data.length; i++) {
                if (i<data.length-1) {
                    T t = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = t;
                }else {
                    decreaseArray();
                }
            }
        }
    }
}