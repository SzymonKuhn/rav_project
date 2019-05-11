package pl.sda.rav;

public abstract class Vehicle implements Comparable <Vehicle> {
    private int vin;
    private String name;
    private int productionDate;
    public int compareTo(Vehicle o) {
        return 0;
    }

    public Vehicle(int vin, String name, int productionDate) {
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

    public int getProductionDate() {
        return productionDate;
    }
}
