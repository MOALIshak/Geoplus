package app.Triangle;
import app.Shape;

/**
 * This is the class for calculating triangle's stuff
 * @author Ishak Moali
 */
public class RectangleTriangle extends Shape
{
    /**
     * Constructor of the class Rectangle Triangle
     */
    public RectangleTriangle()
    {

    }

    /**
     * This is the method to calculate the area of the choosen rectangle triangle
     * @author Ishak Moali
     * @param side1
     * @param side2
     * @param side3
     */
    public void Perimeter(double side1, double side2, double side3)
    {
        perimeter = side1 + side2 + side3;

        System.out.println("The perimeter of your rectangle triangle = " + perimeter + ".");
    }

    /**
     * Method to calculate the area of the triangle
     * @author Ishak Moali
     * @param side1
     * @param side2
     * @param side3
     */
    public void Area(double side1, double side2, double side3)
    {
        area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

        System.out.println("The area of your rectangle triangle = " + area + "."); 
    }

    /**
     * Method to calculate the semi perimeter
     * @author Ishak Moali
     */
    public void semiPerimeter()
    {
        p = perimeter / 2;
    }

    /**
     * This is the method to verify the authenticity of the rectangle triangle
     * @param side1
     * @param side2
     * @param side3
     */
    public void Verification(double side1, double side2, double side3)
    {
        if(Math.pow(side2, 2) + Math.pow(side3, 2) != Math.pow(side1, 2));
        {
            System.out.println("Invalid coordinates for the rectangle triangle!");
            verifyValue = false;
        }
    }
}