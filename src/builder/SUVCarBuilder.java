package builder;

import model.Car;
import model.CarType;
import model.Transmission;

// Concrete builder for constructing SUV cars
public class SUVCarBuilder implements CarBuilder {
    private CarType carType = CarType.SUV;
    private String engine;
    private Transmission transmission;
    private int seats;
    private boolean hasGPS;

    @Override
    public CarBuilder setCarType(CarType type) {
        this.carType = type;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
        return this;
    }

    @Override
    public Car build() {
        if (seats < 4) {
            throw new IllegalArgumentException("SUV must have at least 4 seats!");
        }
        return new Car(carType, engine, transmission, seats, hasGPS);
    }
}
