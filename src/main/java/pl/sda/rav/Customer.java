package pl.sda.rav;

public class Customer extends User {
    public Customer(String login, String password, UserType userType) {
        super(login, password, userType.CUSTOMER);
    }
}
