package devices;

public class DiselCar extends Car{
    public DiselCar(Double x, String model, String producer, int yearOfProduction) {
        super(x, model, producer, yearOfProduction);
        Car diesel;
    }

    public void Refuel(){System.out.println("I have used fuel and your vehicle is full of fuel!");}
}
