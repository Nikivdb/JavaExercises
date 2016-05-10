package be.cegeka.principles.openClose.HowToDoIt;

public class Circle extends Shape {

    private double radius;

    public double Area() {
        return radius * radius * Math.PI;
    }
}
