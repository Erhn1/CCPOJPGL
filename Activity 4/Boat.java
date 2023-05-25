package inheritance;

//SUBTYPE
interface Float {
    void floating();
}

class Boat extends Vehicle implements Float {
    String boatName;
    String mainsailColor;

    @Override
    public void floating() {
        System.out.println(boatName + " is floating with a speed of " + speed + " kN. " + "The color is " + color + " and its main sail color is " + mainsailColor + " The price of this yacht is " + price);
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setMainsailColor(String mainsailColor) {
        this.mainsailColor = mainsailColor;
    }

    public String getMainsailColor() {
        return mainsailColor;
    }

    @Override
    public void stop() {
        System.out.println(boatName + " stopped.");
    }
}
