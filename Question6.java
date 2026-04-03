
interface IoT{

    default void update(){
        System.out.println("Iot device changing the upcoming future");
    }

    static void info(){
        System.out.println("Iot information is given on their website");
    }
}
class IotDevice implements IoT{
    public static void main(String[] args) {
        IotDevice device = new IotDevice();
        device.update();
        IoT.info();

    }
}

