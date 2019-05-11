package pl.sda.rav;

public abstract class Vehicle {
    private int vin;
    private String name;
    private String productionDate;

    public Vehicle(int vin, String name, String productionDate) {
        this.vin = vin;
        this.name = name;
        this.productionDate = productionDate;
    }

    public int getVin() {
        return vin;
    }

    public String getName() {
        return name;
    }

    public String getProductionDate() {
        return productionDate;
    }
}
