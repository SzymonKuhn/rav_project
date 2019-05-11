package pl.sda.rav;

public class Car extends Vehicle {
    private long maxDistance;
    private BodyType bodyType;
    public Car(int vin, String name, int productionDate, BodyType bodyType) { // konstruktor
        super(vin, name, productionDate);
        this.bodyType = bodyType;
    } // koniec konstruktora
}
