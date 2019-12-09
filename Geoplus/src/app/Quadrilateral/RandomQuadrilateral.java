package app.Quadrilateral;

/**
 * This is the class for calculating random quadrilateral's stuff
 * @author Ishak Moali
 */
public class RandomQuadrilateral extends Rectangle
{
    /**
     * Constructor of the class RandomQuadrilateral
     * @author Ishak Moali
     */
    public RandomQuadrilateral()
    {

    }

    /**
     * This is the method to calculate the perimeter of the choosen rectangle
     * @param side1
     * @param side2
     * @param side3
     * @param side4
    */
    @Override
    public void Perimeter(double side1, double side2, double side3, double side4)
    {
        perimeter = side1 + side2 + side3 + side4;
        System.out.println("The perimeter of your random quadrilateral = " + perimeter + ".");
    }
}