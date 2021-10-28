import java.math.BigDecimal;

public class Student {
    public String name;

    public Student(String name, String faculty, int age, BigDecimal scholarship) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.scholarship = scholarship;
    }

    public String faculty;
    public int age;
    public BigDecimal scholarship;
}
