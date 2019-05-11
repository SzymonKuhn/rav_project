package pl.sda.rav;

import java.util.Arrays;

public class VehicleSamples {
    public static Car AUDI = new Car(1, "Audi", 2017, BodyType.SUV);
    public static Car MERCEDES = new Car(2, "Medcedes", 2019, BodyType.SEDAN);
    public static Car BMW = new Car(3, "BMW", 2015, BodyType.KABRIOLET);
    public static Car VOLKSVAGEN = new Car(4, "Volksvagen", 2018, BodyType.KOMBI);


// Arrays.sort(Car);
//        System.out.println("cars sorted = " + Arrays.toString(Car));
     System.out.println("Cars = " + Arrays.toString(Car));
        Arrays.sort(Car);
        System.out.println("Cars sorted = " + Arrays.toString(Car));
}

