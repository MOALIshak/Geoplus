package app.Quadrilateral;
import app.Shape;

/**
 * This is the class for calculating rectangle's stuff
 * @author Ishak Moali
 */
public class Rectangle extends Shape
{
    /**
     * Constructor of the class Rectangle
     * @author Ishak Moali
     */
    public Rectangle()
    {

    }

    /**
     * This is the method to calculate the perimeter of the choosen rectangle
     * @param side1
     * @param side2
     * @param side3
     * @param side4
     */
    public void Perimeter(double side1, double side2, double side3, double side4)
    {
        perimeter = side1 + side2 + side3 + side4;

        System.out.println("The perimeter of your rectangle = " + perimeter + ".");
    }

    /**
     * This is the method to calculate the area of the choosen rectangle
     * @author Ishak Moali
     * @param side1
     * @param side2
     */    
    public void Area(double side1, double side2)
    {
        area = side1 * side2;

        System.out.println("The area of your rectangle = " + area + ".");
    }
    
    /**
     * This is the method to verify if the square is really a square
     * @author Ishak Moali
     * @param side1
     * @param side2
     * @param side3
     * @param side4
     */
    public void Verification(double side1, double side2, double side3, double side4)
    {
        if(side1 != side2 && side3 != side4)
        {
            System.out.println("Invalid coordinates for the rectangle!");
            verifyValue = false;
        }
        else
        {
            verifyValue = true;
        }
    }
}