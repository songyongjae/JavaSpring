package sb02.oop.pr1;

public class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void printUserInfo() {
        System.out.println("User iD: " + userId);
        System.out.println("Name: " + name);
    }
}
