import creatures.Animal;
import creatures.Farm_animal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Phone;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Patrick";
        me.lastName = "Jankiewicz";


        Pet cat = new Pet("Kot", 10.0,"Tomek" );
        me.pet = cat;


        //before feeding
        System.out.println(cat.weight);

        //after feeding
        System.out.println(cat.weight);

        //taking for a walk until weight = 0, uncomment to trigger
        /*
    for(int i = 30; i >0 ; i--) {
        cat.takeForAWalk();
    }
    System.out.println(cat.weight);
*/

        //creating a new creatures.Human object, assigning previously created cat to the human

        Human friend = new Human();
        me.firstName = "Roman";
        me.lastName = "Kowalski";


        System.out.println("Your current salary is " + me.getSalary());
        Scanner decision = new Scanner(System.in);
        System.out.println("Are you sure you want to change your salary? (Y/N)");
        char x = decision.next().charAt(0);
        char Y = 'Y';
        if (x == Y)
        {
            System.out.println("Please enter your new salary. Use (0000,0) format");
                if (x < 0)
                    System.out.println("Please do not use negative values");
                else {
                    double newSalary = decision.nextDouble();
                    me.setSalary(newSalary);
                    System.out.println("Your new salary has been sent to the billing department, please remember to get a new anex from Mr. Hania");
                    System.out.println("By the way, ZUS and US already know about your new salary, no point in hiding it");
                }
            }

        Car auto1 = new Car(5000.0, "Skoda", "Octavia", 2001);
        System.out.println(me.getPet());
        System.out.println(me.getAuto());
        me.setAuto(5000.0, auto1);
        Car auto2 = new Car(6000.0, "Fiat", "Punto", 2010);
        friend.setAuto(6000.0,auto2);
        System.out.println(auto1.check(auto2));
        System.out.println(me.toStringN());
        System.out.println(me.pet.toStringP());
        System.out.println(auto1.toStringC());

        me.Feed();
        Phone phone = new Phone("Sony", "Erikson", 2002);
        me.phone = phone;
        //change phone state
        System.out.println(phone.turnOn());
        System.out.println(phone.turnOn());
        System.out.println(phone.turnOn());

        //change car state
        System.out.println(auto1.turnOn());
        System.out.println(auto1.turnOn());
        System.out.println(auto1.turnOn());


        System.out.println(me.pet.isOwned());
        Farm_animal cow = new Farm_animal("Cow",30.0, "Milka");
        System.out.println(cow);

        System.out.println(cat.feed());
        System.out.println(cat.feed(2.0));
     me.pet.feed();
     System.out.println(me.pet.weight);

     me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk(5.0);
        me.pet.TakeForAWalk(1.0,true);
    }
    }
