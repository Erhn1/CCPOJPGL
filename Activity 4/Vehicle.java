package inheritance;

class Vehicle {
    int speed;
    String color;
    double price;

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }
}

