package pl.sda.rav;

public class Customer extends User {
    public Customer(String login, String password) {
        super(login, password, UserType.CUSTOMER);
    }
}
