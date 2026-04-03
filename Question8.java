interface VoiceControl{
    default void command(){
        System.out.println("Voice command");
    }
}

interface RemoteControl{
    default void command(){
        System.out.println("Remote command");
    }
}

class Settings{
    void showSettings(){
        System.out.println("Device settings module");
    }
}

public class Appliance implements VoiceControl, RemoteControl{

    Settings settings = new Settings();


    public void turnOn(){
        System.out.println("Device is turned ON");
    }

    @Override
    public void command(){
        VoiceControl.super.command();
        RemoteControl.super.command();
        System.out.println("Appliance executed both control systems");
    }

    public void deviceSettings(){
        settings.showSettings();
    }

    public static void main(String[] args){
        Appliance device = new Appliance();

        device.turnOn();
        device.command();
        device.deviceSettings();
    }
}
