package devices;

import creatures.Human;

public class ElectricCar extends Car{

    public ElectricCar(String model, String producer, int yearOfProduction, int value) {
        super(model, producer, yearOfProduction, value);
        Car tesla;

    }
    public void Refuel(){System.out.println("I have used electric current to fully charge your car!");}

    @Override
    public void sell(Human Seller, Human Buyer, Double Price) {

    }
}
