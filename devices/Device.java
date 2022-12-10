package devices;

public abstract class Device {
    public final boolean isNotBroken;
    public final String model;
    public final String producer;

    public boolean isTurnedOn;

    public int yearOfProduction;


    public Device(String model, String producer, int Year){
        this.isNotBroken = true;
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = Year;
        this.isTurnedOn = false;
    }

    public abstract boolean turnOn();
}
