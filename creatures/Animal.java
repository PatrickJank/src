package creatures;

public abstract class Animal {

    final public String species;
    public Double weight;
    public final double DEFAULT_DISTANCE = 1.0;
    public final boolean DEFAULT_RUN = false;

    public String name;
public Human owner;
public Boolean isOwned;
    Boolean isAlive = true;
public Animal(String species, Double weight, String name)
{
    this.isAlive = true;
    this.isOwned = true;
    this.weight = weight;
    this.species = species;
}

public void TakeForAWalk(){
    this.TakeForAWalk(DEFAULT_DISTANCE);
}

public void TakeForAWalk(double Distance){
    this.TakeForAWalk(Distance, DEFAULT_RUN);
}

public void TakeForAWalk(double Distance, boolean DoWeRun){
    if(this.isAlive==true){
        if(DoWeRun == true){
            this.weight-=(Distance*2);
            System.out.println("Ah, what a nice run");
            if(this.weight<=0){
                this.isAlive=false;
                System.out.println("The police is on their way");
            }

        }
        else{
            this.weight-=Distance;
            System.out.println("Ah, what a nice walk");
            if(this.weight<=0){
                this.isAlive=false;
                System.out.println("The police is on their way");
            }
        }
    }
    else{
        System.out.println("You sick person, he is dead");
    }
}
public void Feed()
    {
        if(this.isAlive){
            this.weight += 0.1;
            System.out.println("Om nom nom");
    }
   if(!this.isAlive)
        System.out.println("He's dead, why are you doing this?");
    }
//
//public void takeForAWalk()
//    {
//        if(this.isAlive)
//            this.weight -= 0.2;
//        if(this.weight<= 0.0)
//        {
//            this.isAlive = false;
//            this.weight = 0.0;
//        }
//        if(!this.isAlive)
//        System.out.println("The police is on their way you sicko");
//    }

    public String toStringP(){
    return (species + " " + weight + " " + name);
    }

    public Boolean isOwned() {
        return this.isOwned;
    }
}
