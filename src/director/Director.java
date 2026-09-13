package director;

import builder.CarBuilder;
import model.CarType;
import model.Transmission;

// Optional Director class to manage pre-defined configurations
public class Director {

    // Preset recipe for a sports car
    public void makeSportsCar(CarBuilder builder) {
        builder.setCarType(CarType.SPORTS_CAR)
               .setEngine("V8 4.0L")
               .setTransmission(Transmission.AUTOMATIC)
               .setSeats(2)
               .setGPS(true);
    }
}
