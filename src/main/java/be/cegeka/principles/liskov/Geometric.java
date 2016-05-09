package be.cegeka.principles.liskov;

public class Geometric {

    /**
     * In the following piece of code, the LISKOV principle has been violated.
     * Try to look at the code and see if you can find out what the LISKOV principle is.
     */

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5);
        Square square = new Square(3);

        printDescription(rectangle);
        printDescription(square);
    }

    private static void printDescription(Rectangle rectangle) {
        System.out.println(getDescription(rectangle));

        rectangle.setHeight(1);

        System.out.print("after update: \n\t");
        System.out.println(getDescription(rectangle));
        System.out.println("======================================================");
    }

    private static String getDescription(Rectangle rectangle) {
        return "rectangle with width: " + rectangle.getWidth() + ", height: " + rectangle.getHeight() + " and surface: " + rectangle.calculateSurface();
    }
}
