package pl.sda.rav;

public class Amphibian extends Vehicle {
    private int maxDistanceKm;
    private int maxDistanceMiles;
    private int displacement;

    public Amphibian(int vin, String name, String productionDate, int maxDistanceKm, int maxDistanceMiles, int displacement) {
        super(vin, name, productionDate);
        this.maxDistanceKm = maxDistanceKm;
        this.maxDistanceMiles = maxDistanceMiles;
        this.displacement = displacement;
    }
}
