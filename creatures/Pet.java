package creatures;

import creatures.Animal;
import interfaces.Feedable;

public class Pet extends Animal implements Feedable {
    public Pet(String x, Double weight, String name) {
        super(x, weight, name);
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


}
