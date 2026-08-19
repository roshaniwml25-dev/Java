class Student {
    String name;

    // Parameterized constructor
    Student(String name) {
        this.name = name;
    }
}

class CollegeStudent extends Student {
    String course;

    // Constructor of child class
    CollegeStudent(String name, String course) {
        super(name); // Calls parent constructor
        this.course = course;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent("Rahul", "Computer Science");

        student.display();
    }
}