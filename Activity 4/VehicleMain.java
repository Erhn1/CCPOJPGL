
package inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Car toyotaVIOS = new Car();
        toyotaVIOS.setColor("White");
        toyotaVIOS.setPrice(1500000.00);
        toyotaVIOS.setSpeed(170);
        toyotaVIOS.settireType("Summer");
        toyotaVIOS.setCarName("Toyota VIOS");

        System.out.println("Color: " + toyotaVIOS.getColor());
        System.out.println("Price: " + toyotaVIOS.getPrice());
        System.out.println("Speed: " + toyotaVIOS.getSpeed());
        System.out.println("Tire Type: " + toyotaVIOS.gettireType());
        System.out.println("Car Name: " + toyotaVIOS.getCarName());

        toyotaVIOS.drive();
        toyotaVIOS.stop();
    }
}
