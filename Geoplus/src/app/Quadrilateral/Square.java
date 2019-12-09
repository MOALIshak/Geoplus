package app.Quadrilateral;
import app.Shape;

/**
 * This is the class for calculating square's stuff
 * @author Ishak Moali
 */
public class Square extends Shape
{
    /**
     * Constructor of the class Square
     * @author Ishak Moali
     */
    public Square()
    {

    }
    
    /**
     * This is the method to calculate the perimeter of the square
     * @param side1
     */
    public void Perimeter(double side1)
    {
        perimeter = side1 * 4;

        System.out.println("The perimeter of your square = " + perimeter + ".");
    }

    /**
     * This is the method to calculate the area of the choosen square
     * @author Ishak Moali
     * @param side1
     * @param side2
     */    
    public void Area(double side1)
    {
        area = Math.pow(side1, 2);

        System.out.println("The area of your square = " + area + ".");
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
        if(side1 != side2 && side2 != side3 && side3 != side4)
        {
            System.out.println("Invalid coordinates for the square !");
            verifyValue = false;
        }
        else
        {
            verifyValue = true;
        }
    }
}