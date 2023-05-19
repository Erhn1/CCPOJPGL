package inheritance;

class Vehicle {
    public int speed;
    public String color;
    public double price;

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

