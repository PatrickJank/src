package devices;

import creatures.Human;
import interfaces.Sellable;

public abstract class Car extends Device implements Sellable, Comparable<Car> {
 public Double weight;
 public Boolean airConditioner;
 public Double tankStatus=50.0; //100%, 50% ETC.
 public int parkingSlot;
 String vin;
 public Double value;
 public boolean IsAcquired = false;

 public Car(String model, String producer, int yearOfProduction, int value)
 {
  super(model, producer, yearOfProduction, value);
  this.IsAcquired=true;
  this.value = this.value;
 }
 public boolean check(Car object){
  return (this == object);
 }
 public String toStringC(){
  return (model + " " + producer + " " + value);
 }


 public boolean turnOn() {
  if (isTurnedOn == false){
   isTurnedOn = true;
   return (isTurnedOn);
  }
  else{ if(isTurnedOn == true){
   isTurnedOn = false;

  }
   return isTurnedOn;
  }
 }

 public void Refuel() {

 }

 public void sellCar(Human Seller, Human Buyer, int value) {
  if (!Seller.hasACar(this)) {
   System.out.println("Nie ma auta");
  }
  if (!Buyer.hasFreeSpace()) {
   System.out.println("Kupujący ni ma miejsca");
  }
  if (Buyer.getSalary() < value) {
   System.out.println("Nie ma hajsu");
  }
  Buyer.addCar(this);
  Seller.removeCar(this);
  Buyer.Cash -= value;
  Seller.Cash +=value;
  System.out.println("Udało się, sprzedano i kupiono auto.");
 }
  /*
  for(int i = 0; i<= Seller.garage.length;i++){
  if((Seller.garage[i])==null){System.out.println("Oi, stop that");}
 }
  for(int i = 0; i<= Buyer.garage.length;i++){
   if((Buyer.garage[i])==null){System.out.println("Oi, stop that");}
  }
if((Buyer.Cash)<value){
 System.out.println("You can't afford it buddy");
 Seller.Cash+=value;
 Buyer.Cash-=value;
 */
@Override
 public int compareTo(Car o){
 return this.vin.compareTo(o.vin);
}


}








