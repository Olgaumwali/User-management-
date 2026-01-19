package users;

import java.util.ArrayList;

public class Student extends User {
    private int creditLimit;
    private ArrayList<String> enrolledCourses;

    public Student(int userId, String name, String email, int creditLimit) {
        super(userId, name, email);
        this.creditLimit = creditLimit;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(String courseName) {
        enrolledCourses.add(courseName);
        System.out.println(name + " enrolled in " + courseName);
    }

    @Override
    public void accessFeatures() {
        System.out.println("Accessing student dashboard.");
    }
}
