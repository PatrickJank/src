package creatures;

import devices.Car;
import devices.Phone;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

//importing data libraries for the task 3/4.2
 public class Human extends Animal {
    private static final String DEFAULT_HOMO_SAPIENS = "HOMO SAPIENS";
    public Pet pet;
    private static int DEFAULT_GARAGE_SIZE = 3;
    public Double Cash;
    public String firstName;
    public String lastName;

    public Phone phone;

    // dziedziczenie z klasy animal
    public Human(String DEFAULT_HOMO_SAPIENS, int weight, int salary){
        super(DEFAULT_HOMO_SAPIENS);
        this.salary = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
        Cash = this.salary;
    }
public int test(int garageSize){
     this.DEFAULT_GARAGE_SIZE = garageSize;
     return DEFAULT_GARAGE_SIZE;
}

    public Car[] garage;


public void setCar(Car car, int parkingPlace){
    //sprawdzenie czy wolne miejsce
    if((garage[parkingPlace])!=null){
        System.out.println("Oi,stop that");
    }
    if((parkingPlace)<=0);{
        System.out.println("Oi, stop that");
    }
    if((parkingPlace)< garage.length)
    {
        System.out.println("Oi, stop that");
    }
    this.garage[parkingPlace] = car;
}

public Car getCar(int parkingPlace){
    if((parkingPlace)<=0);{
        System.out.println("Oi, stop that");
    }
    if((parkingPlace)< garage.length)
    {
        System.out.println("Oi, stop that");
    }
    return this.garage[parkingPlace];
}

    private Double salary = 4500.0;

    public Double getSalary() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Information was generated on " + dtf.format(now));
        return (this.salary);
    }

    public Animal getPet()
    {
        return pet;
    }

    public Double setSalary(Double value) {
        this.salary = value;
        return value;
    }



    public void setAuto(Double Price, Car auto)
    {

    if (salary>= Price)
    {
        System.out.println("devices.Car has been bought with cash");
        auto.IsAcquired = true;
        System.out.println(auto);
    }
    else if ((salary> Price/12.0)&&(salary < Price))
    {
        System.out.println("devices.Car has been purchased on credit");
        auto.IsAcquired = true;
        System.out.println(auto);
    }
    else
        System.out.println("You do not have enough cash, try saving some or take a loan");
        System.out.println(auto);
    }
    public String toStringN(){
        return (lastName + " " + firstName);
    }


    public void sell(Human Seller, Human Buyer, Human Price) {
        System.out.println("POLICE");
    }

    public boolean hasACar(Car car) {
        Boolean hasACar = false;
        for (int i = 0; i < garage.length; i++){
            if(this.garage[i] == car){
            }
        }
        return hasACar;
    }

    public boolean hasFreeSpace() {
        for(Car car : garage){
            if(car == null){
                return true;
                }
            }
            return false;
        }

    public void addCar(Car car) {
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                garage[i]= car;
                return;
            }
        }
    }

    public void removeCar(Car car) {
    }

    @Override
    public void sell(Human Seller, Human Buyer, Double Price) {

    }
}


