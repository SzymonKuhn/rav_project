package pl.sda.rav.users;

public class Administrator extends User {
    public Administrator(String login, String password) {
        super(login, password, UserType.ADMIN);
    }
}
