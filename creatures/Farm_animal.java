package creatures;
import interfaces.Edible;

public class Farm_animal extends Animal implements Edible {
    public Farm_animal(String x, Double weight, String name) {
        super(x);
    }

    public boolean beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println("Smacznego");
        return false;
    }

    @Override
    public void sell(Human Seller, Human Buyer, Double Price) {

    }
}

