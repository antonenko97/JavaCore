package stream_api;

public class Course2 implements Course {
    private String name;

    public Course2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}