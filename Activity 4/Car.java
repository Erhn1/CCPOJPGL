package inheritance;

//SUBCLASS
class Car extends Vehicle {
    String carName;
    String tireType;

    public void drive() {
        System.out.println(carName + " is driving with a speed of " + speed + " kmh. " + "The color is " + color + " and its tireype is " + tireType + ". The price of this car is " + price);
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
    
    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getTireType() {
        return tireType;
    }

    // Override the stop method
    @Override
    public void stop() {
        System.out.println(carName + " stopped.");
    }
}
    

    
