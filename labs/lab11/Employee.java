import java.lang.Override;
import java.lang.String;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nName: %s", id, name);
    }
}
