package syc.com;

import lombok.Data;

@Data
public class Student {
    private String name;
    private int age;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
    }
}