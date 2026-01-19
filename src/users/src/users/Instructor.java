package users;

import java.util.ArrayList;

public class Instructor extends User {
    private ArrayList<String> coursesTeaching;

    public Instructor(int userId, String name, String email) {
        super(userId, name, email);
        this.coursesTeaching = new ArrayList<>();
    }

    public void addCourse(String courseName) {
        coursesTeaching.add(courseName);
        System.out.println(name + " is teaching " + courseName);
    }

    @Override
    public void accessFeatures() {
        System.out.println("Accessing instructor dashboard.");
    }
}
