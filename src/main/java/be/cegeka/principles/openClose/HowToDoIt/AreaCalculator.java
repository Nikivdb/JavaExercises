package be.cegeka.principles.openClose.HowToDoIt;

public class AreaCalculator {
    /*Now the AreaCalculator is open for extension, and closed for modification*/

    public double Area(Shape[] shapes)
    {
        double area = 0;
        for (Shape shape : shapes)
        {
            area += shape.Area();
        }

        return area;
    }

}
