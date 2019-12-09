package app;

/**
 * This is the point class who'll serve to the creation of point to determinate the shape we want to use
 * @author Ishak Moali
 * @version 1.0
 * @since 1.0
 */
public class Point
{
    private String _name;
    private double _x;
    private double _y;
    private static double distanceAB;
    private static double distanceBC;
    private static double distanceCD;
    private static double distanceCA;
    private static double distanceDA;

    /**
     * This is the constructor of the class Point
     * @author Ishak Moali
     * @param name
     * @param x //abscissa of the point
     * @param y //ordinate of the point
     */
    public Point(String name, double x, double y)
    {
        setName(name);
        setX(x);
        setY(y);
    }

    /**
     * This is the method to calculate the distance between point A and B
     * @author Ishak Moali
     * @param pointOneX
     * @param pointOneY
     * @param pointTwoX
     * @param pointTwoY
     */
    public void calculateDistanceAB(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY)
    {
        distanceAB = Math.sqrt(Math.pow((pointTwoX - pointOneX), 2) + Math.pow((pointTwoY - pointOneY), 2));
    }

    /**
     * This is the method to calculate the distance between point B and C
     * @author Ishak Moali
     * @param pointOneX
     * @param pointOneY
     * @param pointTwoX
     * @param pointTwoY
     */
    public void calculateDistanceBC(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY)
    {
        distanceBC = Math.sqrt(Math.pow((pointTwoX - pointOneX), 2) + Math.pow((pointTwoY - pointOneY), 2));
    }

    /**
     * This is the method to calculate the distance between point B and C
     * @author Ishak Moali
     * @param pointOneX
     * @param pointOneY
     * @param pointTwoX
     * @param pointTwoY
     */
    public void calculateDistanceCA(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY)
    {
        distanceCA = Math.sqrt(Math.pow((pointTwoX - pointOneX), 2) + Math.pow((pointTwoY - pointOneY), 2));
    }

    /**
     * This is the method to calculate the distance between point C and D
     * @author Ishak Moali
     * @param pointOneX
     * @param pointOneY
     * @param pointTwoX
     * @param pointTwoY
     */
    public void calculateDistanceCD(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY)
    {
        distanceCD = Math.sqrt(Math.pow((pointTwoX - pointOneX), 2) + Math.pow((pointTwoY - pointOneY), 2));
    }

    /**
     * This is the method to calculate the distance between point D and A
     * @author Ishak Moali
     * @param pointOneX
     * @param pointOneY
     * @param pointTwoX
     * @param pointTwoY
     */
    public void calculateDistanceDA(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY)
    {
        distanceDA = Math.sqrt(Math.pow((pointTwoX - pointOneX), 2) + Math.pow((pointTwoY - pointOneY), 2));
    }

    /**
     * Encapsulation for the name of the point
     * @author Ishak Moali
     * @return
     */
    public String getName()
    {
        return this._name;
    }

    /**
     * Encapsulation for the name of the point
     * @author Ishak Moali
     * @param _setName
     */
    public void setName(String _setName)
    {
        _setName = this._name;
    }

    /**
     * Encapsulation for the abscissa of the point
     * @author Ishak Moali
     * @return
     */
    public double getX()
    {
        return this._x;
    }

    /**
     * Encapsulation for the abscissa of the point
     * @author Ishak Moali
     * @param _setX
     */
    public void setX(double _setX)
    {
        _setX = this._x;
    }

    /**
     * Encapsulation for the ordinate of the point
     * @author Ishak Moali
     * @return
     */
    public double getY()
    {
        return this._y;
    }

    /**
     * Encapsulation for the ordinate of the point
     * @author Ishak Moali
     * @param _setY
     */
    public void setY(double _setY)
    {
        _setY = this._y;
    }

    /**
     * Encapsulation for the distanceAB
     * @author Ishak Moali
     * @return
     */
    public double getDistanceAB()
    {
        return distanceAB;
    }

    /**
     * Encapsulation for the distanceBC
     * @author Ishak Moali
     * @return
     */
    public double getDistanceBC()
    {
        return distanceBC;
    }

    /**
     * Encapsulation for the distanceCD
     * @author Ishak Moali
     * @return 
     */
    public double getDistanceCA()
    {
        return distanceCA;
    }

    /**
     * Encapsulation for the distanceCD
     * @author Ishak Moali
     * @return 
     */
    public double getDistanceCD()
    {
        return distanceCD;
    }

    /**
     * Encapsulation for the distanceDA
     * @author Ishak Moali
     * @return
     */
    public double getDistanceDA()
    {
        return distanceDA;
    }
}