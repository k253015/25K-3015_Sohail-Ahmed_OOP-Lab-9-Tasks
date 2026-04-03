interface ElectricSystem{
    default void showStatus(){
        System.out.println("Electric Vehicle Active");
    }

    default void info(){
        System.out.println("Vehicle uses battery");
    }
}

interface GPSSystem{
    default void showStatus(){
        System.out.println("GPS Working");
    }

    default void info(){
        System.out.println("vehicle uses for navigation");
    }
}

class Engine{
    void run(){
        System.out.println("Engine is working inside vehicle");
    }
}

public class Vehicle implements ElectricSystem, GPSSystem{

    Engine engine = new Engine();

    public void start(){
        System.out.println("Vehicle started");
    }

    @Override
    public void showStatus(){
        ElectricSystem.super.showStatus();
        GPSSystem.super.showStatus();
        System.out.println("Vehicle status");
    }

    @Override
    public void info(){
        ElectricSystem.super.info();
        GPSSystem.super.info();
    }

    public void engineWork(){
        engine.run();
    }

    public static void main(String[] args){
        Vehicle v = new Vehicle();

        v.start();
        v.showStatus();
        v.info();
        v.engineWork();
    }
}
