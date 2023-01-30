import pocu.Passenger;
import pocu.Vehicle;
import pocu.VehicleType;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Passenger blackWidow = new Passenger("Natasha");
        blackWidow.sayName();

        Vehicle motocycle = new Vehicle(VehicleType.MOTORCYCLE);
        motocycle.addPassenger(blackWidow);
        motocycle.addFuel(22.0);

        ArrayList<Passenger> taxiPassenger = new ArrayList<Passenger>();
        taxiPassenger.add(new Passenger("Tony"));
        taxiPassenger.add(new Passenger("Thor"));

        Vehicle taxi = new Vehicle(VehicleType.SEDAN, taxiPassenger);
        taxi.addFuel(60.0);

        ArrayList<Passenger> vanPassengers = new ArrayList<Passenger>();
        vanPassengers.add(new Passenger("Steve"));
        vanPassengers.add(new Passenger("Bucky"));
        vanPassengers.add(new Passenger("Wanda"));
        vanPassengers.add(new Passenger("Bruce"));
        vanPassengers.add(new Passenger("Client"));

        Vehicle van = new Vehicle(VehicleType.MINIVAN, vanPassengers, 70.5);

        System.out.println("Motocycle:");
        motocycle.drive(50);

        System.out.println("Taxi : ");
        taxi.drive(50);

        System.out.println("Van:");
        van.drive(50);

        van.removePassenger("Steve");
        van.removePassenger("Bucky");

        System.out.println("Van: ");
        van.drive(1000);

        System.out.println("Van :");
        van.addFuel(50.0);
        van.drive(1000);

    }
}