import builder.SportsCarBuilder;
import builder.SUVCarBuilder;
import director.Director;
import model.Car;
import model.Transmission;

// Client class to run and demonstrate the Builder pattern implementation
public class Main {
    public static void main(String[] args) {
        // 1. Building a sports car using the Director
        Director director = new Director();
        SportsCarBuilder sportsBuilder = new SportsCarBuilder();
        director.makeSportsCar(sportsBuilder);
        Car sportsCar = sportsBuilder.build();
        
        System.out.println("Built with Director:");
        System.out.println(sportsCar);

        System.out.println("----------------------------------------");

        // 2. Building an SUV manually using method chaining (Fluent API)
        SUVCarBuilder suvBuilder = new SUVCarBuilder();
        Car suv = suvBuilder.setEngine("V6 3.5L")
                            .setTransmission(Transmission.MANUAL)
                            .setSeats(5)
                            .setGPS(true)
                            .build();
                            
        System.out.println("Built step-by-step (Fluent API):");
        System.out.println(suv);
    }
}
