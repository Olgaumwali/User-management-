package users;

public class Admin extends User {

    public Admin(int userId, String name, String email) {
        super(userId, name, email);
    }

    public void deleteUser(User user) {
        System.out.println("Admin deleted user: " + user.name);
    }

    @Override
    public void accessFeatures() {
        System.out.println("Accessing admin control panel.");
    }
}
