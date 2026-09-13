package builder;

import model.Car;
import model.CarType;
import model.Transmission;

// Concrete builder for constructing sports cars
public class SportsCarBuilder implements CarBuilder {
    private CarType carType = CarType.SPORTS_CAR;
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
        if (seats > 2) {
            throw new IllegalArgumentException("Sports car cannot have more than 2 seats!");
        }
        return new Car(carType, engine, transmission, seats, hasGPS);
    }
}
