package be.cegeka.principles.openClose.notHowToDoIt;

public class AreaCalculator {

    /*The open-closed principle states the following:
    *   “software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification”.
    **/

    /*Requirement 1, calculate the surface of rectangles*/
    public double Area(Rectangle[] rectangles)
    {
        double area = 0;
        for (Rectangle rectangle : rectangles)
        {
            area += rectangle.getWidth() * rectangle.getHeight();
        }

        return area;
    }

    /*After a week, the scope changes and you also need to calculate the surface of circles, we adapted the area function
    * in the following way: */
    public double Area(Object[] shapes)
    {
        double area = 0;
        for (Object shape : shapes)
        {
            if (shape instanceof Rectangle)
            {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getWidth() * rectangle.getHeight();
            }
            else
            {
                Circle circle = (Circle)shape;
                area += circle.getRadius() * circle.getRadius() * Math.PI;
            }
        }

        return area;
    }

    /* After a while, the customer wants us to also adapt the code to add triangles. Although this looks like a simple requirement,
     * we need to adapt existing code, hence the AreaCalculator is 'not closed for modification'*/
}
