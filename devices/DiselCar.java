package devices;

import creatures.Human;

public class DiselCar extends Car{
    public DiselCar(String model, String producer, int yearOfProduction, int value) {
        super(model, producer, yearOfProduction, value);
        Car diesel;
    }

    public void Refuel(){System.out.println("I have used fuel and your vehicle is full of fuel!");}

    @Override
    public void sell(Human Seller, Human Buyer, Double Price) {

    }
}
