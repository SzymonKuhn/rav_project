package pl.sda.rav;

import pl.sda.rav.users.User;

import java.time.LocalTime;

public class Order {
    private int id;
    private User user;
    private Vehicle vehicle;
    private LocalTime startDate;
    private LocalTime endDate;
    private static int COUNT = 0;

    public Order(int id, User user, Vehicle vehicle, LocalTime startDate) {
        COUNT++;
        this.id = COUNT;
        this.user = user;
        this.vehicle = vehicle;
        this.startDate = startDate;
    }
}
