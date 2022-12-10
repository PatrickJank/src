package devices;

import javax.print.attribute.standard.MediaSize;

public class Phone extends Device {



    public String toString(){
        return (model + " " + producer);
    }

    public Phone(String model, String producer, int year){
        super(model, producer, year);
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
