package devices;

public class LPGCar extends Car{

    public LPGCar(Double x, String model, String producer, int yearOfProduction) {
        super(x, model, producer, yearOfProduction);
        Car gruhot;
    }
    public void Refuel(){System.out.println("I have used gas to fuel your car");}
}
