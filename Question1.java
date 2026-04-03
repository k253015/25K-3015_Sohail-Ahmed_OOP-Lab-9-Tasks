
interface Wifi{
    default void connect(){
        System.out.println("Wifi is box of internet");
    }
}
interface Bluetooth{
    default void connect(){
        System.out.println("It does not exist Physically");
    }
}
class Device implements Wifi,Bluetooth{  // every device can implement both wifi and bluetooth
    public void connect(){
        Wifi.super.connect();
        Bluetooth.super.connect();
        System.out.println("Device can Connect both Wifi and Blue tooth");
    }
}
public class University {
    static class  Department{   // inner class of fast university
        Device D;  // device belongs to  department

    }
    public static void main(String[] args){
       Device D = new Device();
       D.connect();
       University university = new University();
        University.Department dept = new University.Department();
        dept.D = D;  // assign device into department

    }

}
