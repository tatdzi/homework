package home_work_7.dto;

public class Word {
    private String name;
    private Long count;

    public Word(String name, Long count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Word{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
