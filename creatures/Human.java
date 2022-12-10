package creatures;

import creatures.Animal;
import devices.Car;
import devices.Phone;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

//importing data libraries for the task 3/4.2
 public class Human extends Animal {
    public Pet pet;
    public String firstName;
    public String lastName;

    public Phone phone;

    // dziedziczenie z klasy animal
    public Human(){
        super("homo sapiens", 70.0, "Gal Anonim");
        this.salary = 0.0;
    }



    private Car auto;

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

    public Car getAuto()
    {
        return auto;
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


}


