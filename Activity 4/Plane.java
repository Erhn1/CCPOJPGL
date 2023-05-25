package inheritance;

//SUBCLASS
class Plane extends Vehicle {
    String planeName;
    int wingsSpan;

    public void fly() {
        System.out.println(planeName + " is flying with a speed of " + speed + " kmh. " + "The color is " + color + " and its wings span is " + wingsSpan + "m" + ". The price of this plane is " + price);
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }
    
    public String getPlaneName() {
        return planeName;
    }

    public void setWingsSpan(int wingsSpan) {
        this.wingsSpan = wingsSpan;
    }

    public double getWingsSpan() {
        return wingsSpan;
    }
    
    // Override the stop method
    @Override
    public void stop() {
        System.out.println(planeName + " stopped.");
    }
}
