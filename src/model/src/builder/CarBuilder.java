package builder;

import model.Car;
import model.CarType;
import model.Transmission;

public interface CarBuilder {
    CarBuilder setCarType(CarType type);
    CarBuilder setEngine(String engine);
    CarBuilder setTransmission(Transmission transmission);
    CarBuilder setSeats(int seats);
    CarBuilder setGPS(boolean hasGPS);
    Car build();
}
