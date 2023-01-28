package devices;

import creatures.Human;
import interfaces.Sellable;

public class LPGCar extends Car implements Sellable {

    public LPGCar(String model, String producer, int yearOfProduction, int value) {
        super(model, producer, yearOfProduction, value);
        Car gruhot;
    }
    public void Refuel(){System.out.println("I have used gas to fuel your car");}

    @Override
    public void sell(Human Seller, Human Buyer, Double Price) {

    }
}
