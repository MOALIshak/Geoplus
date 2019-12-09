package app;

/**
 * This is an abstract class who'll serve to the inheritance of specific shapes
 * @author Ishak Moali
 * @since 1.0
 */
abstract public class Shape
{
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;
    protected double perimeter;
    protected double area;
    protected double p; //Semi perimeter
    protected boolean verifyValue;

    /**
     * Abstract method to calculate the perimeter of the choosen shape
     * @author Ishak Moali
     */
    public void Perimeter()
    {

    }

    /**
     * Abstract method to calculate the area of the choosen shape
     * @author Ishak Moali
     */
    public void Area()
    {

    }

    /**
     * Abstract method to verify the reality of the choosen shape
     * @author Ishak Moali
     */
    public void Verification()
    {

    }
} 