package oops.static091;


class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

public class Main {
    public static void main(String[] args) {
        Student.school = "JMV";
        Student student1 = new Student();
        student1.name = "jhony";
        System.out.println(Student.school);
    }
}
