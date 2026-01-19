import users.Student;
import users.Instructor;
import users.Admin;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "Alice", "alice@email.com", 18);
        Instructor instructor = new Instructor(2, "Bob", "bob@email.com");
        Admin admin = new Admin(3, "Carol", "carol@email.com");

        student.login();
        student.accessFeatures();
        student.enrollCourse("Math 101");

        System.out.println();

        instructor.login();
        instructor.accessFeatures();
        instructor.addCourse("Physics 201");

        System.out.println();

        admin.login();
        admin.accessFeatures();
        admin.deleteUser(student);
    }
          }
