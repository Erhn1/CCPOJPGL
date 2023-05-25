package inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Car toyotaVIOS = new Car();
        toyotaVIOS.setColor("White");
        toyotaVIOS.setPrice(1500000.00);
        toyotaVIOS.setSpeed(170);
        toyotaVIOS.setTireType("Summer");
        toyotaVIOS.setCarName("Toyota VIOS");
        toyotaVIOS.drive();
        toyotaVIOS.stop();
        
        System.out.println("------");

        Plane u2SpyPlane = new Plane();
        u2SpyPlane.setColor("Gray");
        u2SpyPlane.setPrice(5000000.00);
        u2SpyPlane.setSpeed(805);
        u2SpyPlane.setWingsSpan(25);
        u2SpyPlane.setPlaneName("U-2 Spy Plane");
        u2SpyPlane.fly();
        u2SpyPlane.stop();
        
        System.out.println("------");

        Boat FandangoYacht = new Boat();
        FandangoYacht.setColor("White");
        FandangoYacht.setPrice(3000000.00);
        FandangoYacht.setSpeed(18);
        FandangoYacht.setMainsailColor("Violet");
        FandangoYacht.setBoatName("Fandango Yacht");
        FandangoYacht.floating();
        FandangoYacht.stop();
    }
}
