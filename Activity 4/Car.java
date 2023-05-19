
package inheritance;

class Car extends Vehicle {
    String carName;
    String tireType;

    public void drive() {
        System.out.println(carName + " is driving.");
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
    
    public void settireType(String tireType) {
        this.tireType = tireType;
    }

    public String gettireType() {
        return tireType;
    }

    // Override the stop method
    @Override
    public void stop() {
        System.out.println(carName + " stopped.");
    }
}
    

    
