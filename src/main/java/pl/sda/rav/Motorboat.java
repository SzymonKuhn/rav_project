package pl.sda.rav;

public class Motorboat extends Vehicle {
    private int maxDistance;
    private int displacement;

    public Motorboat(int vin, String name, String productionDate, int maxDistance, int displacement) {
        super(vin, name, productionDate);
        this.maxDistance = maxDistance;
        this.displacement = displacement;
    }
}
