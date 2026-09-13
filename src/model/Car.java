package model;

// Product class representing the complex Car object
public class Car {
    private final CarType carType;
    private final String engine;
    private final Transmission transmission;
    private final int seats;
    private final boolean hasGPS;

    // Constructor to initialize all car fields
    public Car(CarType carType, String engine, Transmission transmission, int seats, boolean hasGPS) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.seats = seats;
        this.hasGPS = hasGPS;
    }

    // Display car specifications as text
    @Override
    public String toString() {
        return "Car [" +
                "Type=" + carType +
                ", Engine='" + engine + '\'' +
                ", Transmission=" + transmission +
                ", Seats=" + seats +
                ", GPS=" + hasGPS +
                ']';
    }
}
