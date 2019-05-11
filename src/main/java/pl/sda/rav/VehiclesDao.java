package pl.sda.rav;
import java.applet.AudioClip;
import java.util.Arrays;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.List;

public class VehiclesDao {
    List<Vehicle> vehicleList = new ArrayList<>();
    //vehicleList.add(new Car(1, "Audi",2017, BodyType.SUV));

public void add(Vehicle vehicle) {
    vehicleList.add(vehicle);
}

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}

