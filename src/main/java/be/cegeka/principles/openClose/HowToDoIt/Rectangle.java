package be.cegeka.principles.openClose.HowToDoIt;

public class Rectangle extends Shape {
    private double weight;
    private double width;

    public double Area() {
        return width * weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}