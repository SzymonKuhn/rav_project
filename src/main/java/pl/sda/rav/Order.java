package pl.sda.rav;

import java.time.LocalTime;

public class Order {
    private int id;
    private User user;
    private Vehicle vehicle;
    private LocalTime startDate;
    private LocalTime endDate;

    public Order(int id, User user, Vehicle vehicle, LocalTime startDate) {
        this.id = id;
        this.user = user;
        this.vehicle = vehicle;
        this.startDate = startDate;
    }
}
