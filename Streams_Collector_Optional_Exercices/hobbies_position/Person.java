import java.util.List;

public class Person {
    private int code;
    private String name;
    private String position;
    private int age;
    private double salary;
    private List<String> hobbies;

    public Person(int code, String name, String position, int age, double salary, List<String> hobbies) {
        this.code = code;
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.hobbies = hobbies;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s %d $ %.2f", code, name, position, age, salary);
    }
}
