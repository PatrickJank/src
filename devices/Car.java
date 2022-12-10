package devices;

public class Car extends Device {
 public Double weight;
 public Boolean airConditioner;
 public Double price;
 public boolean IsAcquired = false;

 public Car(Double x, String model, String producer, int yearOfProduction)
 {
  super(model, producer, yearOfProduction);
  this.IsAcquired=true;
  this.price = x;
 }
 public boolean check(Car object){
  return (this == object);
 }
 public String toStringC(){
  return (model + " " + producer + " " + price);
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
}





