package creatures;

import interfaces.Feedable;
import interfaces.Sellable;

public class Pet extends Animal implements Feedable, Sellable {
    public Pet(String x, Double weight, String name) {
        super(x);
    }

    public double feed() {
    this.weight=this.weight+1;
    return this.weight;
    }

    public double feed(double weight)
    {
        this.weight = this.weight+weight;
        return this.weight;
    }


    public void sell(Human Seller, Human Buyer, Double Price) {
        System.out.println("PETS CANNOT BE SOLD");
    }
}
