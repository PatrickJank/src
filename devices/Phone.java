package devices;

import javax.print.attribute.standard.MediaSize;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {

    private static final String DEFAULT_SERVER = "www.google.pl";
    private static final Double DEFAULT_APP_VERSION = 5.0;

  void installAnApp(List<String> appNames){
      for (String appName: appNames){
          this.installAnApp(appName);
      }
  }

  void installAnApp(String appName){
      this.installAnApp(appName, DEFAULT_APP_VERSION);
  }

  void installAnApp(String appName, double appVersion)
  {
      this.installAnApp(appName, appVersion, DEFAULT_SERVER);
  }

  void installAnApp(String appName, double appVersion, String appServer)
  {
      try
      {
          URL url = new URL("https",appServer,appName+"-"+appVersion);
          this.installAnApp(url);
      } catch (MalformedURLException e) {
          System.out.println("Something went wrong!");
      }
  }

  void installAnApp(URL url)
  {
      System.out.println("Instalacja");
  }








    public String toString(){
        return (model + " " + producer);
    }

    public Phone(String model, String producer, int year, int value){
        super(model, producer, year, value);
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
