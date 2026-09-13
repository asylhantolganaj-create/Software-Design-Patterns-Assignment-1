package builder;

import model.Car;
import model.CarType;
import model.Transmission;

// Builder interface defining steps for building a car
public interface CarBuilder {
    CarBuilder setCarType(CarType type);
    CarBuilder setEngine(String engine);
    CarBuilder setTransmission(Transmission transmission);
    CarBuilder setSeats(int seats);
    CarBuilder setGPS(boolean hasGPS);
    
    // Method to construct and return the final product
    Car build();
}
