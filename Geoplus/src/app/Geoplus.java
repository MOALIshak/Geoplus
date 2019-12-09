package app;
import app.Quadrilateral.*;
import app.Triangle.*;
import app.Point;
import java.util.Scanner;

/**
 * This is the main class of the program
 * @author Ishak Moali
 * @version 1.1
 */
public class Geoplus 
{  
    static String _question;
    static double xP1;
    static double yP1;
    static double xP2;
    static double yP2;
    static double xP3;
    static double yP3;
    static double xP4;
    static double yP4;

    public static void main(String[] args) throws Exception
    {   
        Scanner coordinates = new Scanner(System.in);

        startQuestion();

        switch(_question)
        {
            case "Square":
                System.out.println("Now, please enter the coordinates of the point to create a square and\nyou'll get the measurements of it.");
                // BLOC for the point A
                System.out.print("Please enter the abscissa of the first point : ");
                xP1 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the first point : ");
                yP1 = coordinates.nextDouble();
                coordinates.reset();
                Point p1 = new Point("A", xP1, yP1);

                // BLOC for the point B
                System.out.print("Please enter the abscissa of the second point : ");
                xP2 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the second point : ");
                yP2 = coordinates.nextDouble();
                coordinates.reset();
                Point p2 = new Point("B", xP2, yP2);

                // BLOC for the point C
                System.out.print("Please enter the abscissa of the third point : ");
                xP3 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the third point : ");
                yP3 = coordinates.nextDouble();
                coordinates.reset();
                Point p3 = new Point("C", xP3, yP3);

                // BLOC for the point D
                System.out.print("Please enter the abscissa of the fourth point : ");
                xP4 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the fourth point : ");
                yP4 = coordinates.nextDouble();
                coordinates.reset();
                Point p4 = new Point("D", xP4, yP4);

                //Calculate the distance between points
                p1.calculateDistanceAB(xP1, yP1, xP2, yP2);
                p2.calculateDistanceBC(xP2, yP2, xP3, yP3);
                p3.calculateDistanceCD(xP3, yP3, xP4, yP4);
                p4.calculateDistanceDA(xP4, yP4, xP1, yP1);

                Square square = new Square();

                square.Verification(p1.getDistanceAB(), p2.getDistanceBC(), p3.getDistanceCD(), p4.getDistanceDA());
                if(square.verifyValue == true)
                {
                    square.Perimeter(p1.getDistanceAB());
                    square.Area(p1.getDistanceAB());
                }
                else
                {
                    System.out.println("Haha! You tried to break my code, noob!");
                }

                break;
            case "Rectangle":
                System.out.println("Now, please enter the coordinates of the point to create a square and\nyou'll get the measurements of it.");
                // BLOC for the point A
                System.out.print("Please enter the abscissa of the first point : ");
                xP1 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the first point : ");
                yP1 = coordinates.nextDouble();
                coordinates.reset();
                Point p5 = new Point("A", xP1, yP1);

                // BLOC for the point B
                System.out.print("Please enter the abscissa of the second point : ");
                xP2 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the second point : ");
                yP2 = coordinates.nextDouble();
                coordinates.reset();
                Point p6 = new Point("B", xP2, yP2);

                // BLOC for the point C
                System.out.print("Please enter the abscissa of the third point : ");
                xP3 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the third point : ");
                yP3 = coordinates.nextDouble();
                coordinates.reset();
                Point p7 = new Point("C", xP3, yP3);

                // BLOC for the point D
                System.out.print("Please enter the abscissa of the fourth point : ");
                xP4 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the fourth point : ");
                yP4 = coordinates.nextDouble();
                coordinates.reset();
                Point p8 = new Point("D", xP4, yP4);

                //Calculate the distance between points
                p5.calculateDistanceAB(xP1, yP1, xP2, yP2);
                p6.calculateDistanceBC(xP2, yP2, xP3, yP3);
                p7.calculateDistanceCD(xP3, yP3, xP4, yP4);
                p8.calculateDistanceDA(xP4, yP4, xP1, yP1);

                Rectangle rectangle = new Rectangle();

                rectangle.Verification(p5.getDistanceAB(), p8.getDistanceCD(), p6.getDistanceBC(), p7.getDistanceDA());
                if(rectangle.verifyValue == true)
                {
                    rectangle.Perimeter(p5.getDistanceAB(), p6.getDistanceBC(), p7.getDistanceCD(), p8.getDistanceDA());
                    rectangle.Area(p5.getDistanceAB(), p6.getDistanceBC());
                }
                else
                {
                    System.out.println("Haha! You tried to break my code, noob!");
                }

                break;
            case "random Quadrilateral":
                System.out.println("Now, please enter the coordinates of the point to create a square and\nyou'll get the measurements of it.");
                // BLOC for the point A
                System.out.print("Please enter the abscissa of the first point : ");
                xP1 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the first point : ");
                yP1 = coordinates.nextDouble();
                coordinates.reset();
                Point p9 = new Point("A", xP1, yP1);

                // BLOC for the point B
                System.out.print("Please enter the abscissa of the second point : ");
                xP2 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the second point : ");
                yP2 = coordinates.nextDouble();
                coordinates.reset();
                Point p10 = new Point("B", xP2, yP2);

                // BLOC for the point C
                System.out.print("Please enter the abscissa of the third point : ");
                xP3 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the third point : ");
                yP3 = coordinates.nextDouble();
                coordinates.reset();
                Point p11 = new Point("C", xP3, yP3);

                // BLOC for the point D
                System.out.print("Please enter the abscissa of the fourth point : ");
                xP4 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the fourth point : ");
                yP4 = coordinates.nextDouble();
                coordinates.reset();
                Point p12 = new Point("D", xP4, yP4);

                //Calculate the distance between points
                p9.calculateDistanceAB(xP1, yP1, xP2, yP2);
                p10.calculateDistanceBC(xP2, yP2, xP3, yP3);
                p11.calculateDistanceCD(xP3, yP3, xP4, yP4);
                p12.calculateDistanceDA(xP4, yP4, xP1, yP1);

                RandomQuadrilateral rQuadrilateral = new RandomQuadrilateral();

                rQuadrilateral.Perimeter(p9.getDistanceAB(), p10.getDistanceBC(), p11.getDistanceCD(), p12.getDistanceDA());

                break;
            case "random Triangle":
                System.out.println("Now, please enter the coordinates of the point to create a square and\nyou'll get the measurements of it.");
                // BLOC for the point A
                System.out.print("Please enter the abscissa of the first point : ");
                xP1 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the first point : ");
                yP1 = coordinates.nextDouble();
                coordinates.reset();
                Point p13 = new Point("A", xP1, yP1);

                // BLOC for the point B
                System.out.print("Please enter the abscissa of the second point : ");
                xP2 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the second point : ");
                yP2 = coordinates.nextDouble();
                coordinates.reset();
                Point p14 = new Point("B", xP2, yP2);

                // BLOC for the point C
                System.out.print("Please enter the abscissa of the third point : ");
                xP3 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the third point : ");
                yP3 = coordinates.nextDouble();
                coordinates.reset();
                Point p15 = new Point("C", xP3, yP3);

                //Calculate the distance between points
                p13.calculateDistanceAB(xP1, yP1, xP2, yP2);
                p14.calculateDistanceBC(xP2, yP2, xP3, yP3);
                p15.calculateDistanceCA(xP3, yP3, xP1, yP1);

                RandomTriangle rTriangle = new RandomTriangle();
                
                rTriangle.Perimeter(p13.getDistanceAB(), p14.getDistanceBC(), p15.getDistanceCA());
                rTriangle.semiPerimeter();
                rTriangle.Area(p13.getDistanceAB(), p14.getDistanceBC(), p15.getDistanceCA());

                break;
            case "rectangle Triangle":
                System.out.println("Now, please enter the coordinates of the point to create a square and\nyou'll get the measurements of it.");
                // BLOC for the point A
                System.out.print("Please enter the abscissa of the first point : ");
                xP1 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the first point : ");
                yP1 = coordinates.nextDouble();
                coordinates.reset();
                Point p16 = new Point("A", xP1, yP1);

                // BLOC for the point B
                System.out.print("Please enter the abscissa of the second point : ");
                xP2 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the second point : ");
                yP2 = coordinates.nextDouble();
                coordinates.reset();
                Point p17 = new Point("B", xP2, yP2);

                // BLOC for the point C
                System.out.print("Please enter the abscissa of the third point : ");
                xP3 = coordinates.nextDouble();
                coordinates.reset();
                System.out.print("Please enter the ordinate of the third point : ");
                yP3 = coordinates.nextDouble();
                coordinates.reset();
                Point p18 = new Point("C", xP3, yP3);

                //Calculate the distance between points
                p16.calculateDistanceAB(xP1, yP1, xP2, yP2);
                p17.calculateDistanceBC(xP2, yP2, xP3, yP3);
                p18.calculateDistanceCA(xP3, yP3, xP1, yP1);

                RectangleTriangle rectTriangle = new RectangleTriangle();

                rectTriangle.Verification(p16.getDistanceAB(), p17.getDistanceBC(), p18.getDistanceCD());
                if(rectTriangle.verifyValue == false)
                {
                    rectTriangle.Perimeter(p16.getDistanceAB(), p17.getDistanceBC(), p18.getDistanceCA());
                    rectTriangle.semiPerimeter();
                    rectTriangle.Area(p16.getDistanceAB(), p17.getDistanceBC(), p18.getDistanceCA());
                }
                else
                {
                    System.out.println("Haha! You tried to break my code, noob!");
                }
                
                break;
        }
    }

    /**
     * It's a method who will ask the user about what shapes he want to calculate the proprieties
     * @author Ishak Moali
     * @version 1.0
     * @since 1.1
     */
    public static void startQuestion()
    {
        Scanner inputQuestion = new Scanner(System.in);

        System.out.println("Hello user, this is Geoplus!");
        System.out.println("Which shape do you want to calculate her proprieties?");
        System.out.println("Make a choice between those: Square, Rectangle, random Quadrilateral, random Triangle or rectangle Triangle?");
        _question = inputQuestion.nextLine();

        if(!_question.equals("Square") || !_question.equals("Rectangle") || !_question.equals("random Quadrilateral") || !_question.equals("random Triangle") || !_question.equals("rectangle Triangle"))
        {
            System.out.println("This shape doesn't exist in Geoplus, please retry.");
            _question = inputQuestion.nextLine();
        }
    }

    /**
     * Encapsulation for the abscissa of the first point
     * @author Ishak Moali
     */
    public double getP1X()
    {
        return xP1;
    }

    /**
     * Encapsulation for the abscissa of the second point
     * @author Ishak Moali
     */
    public double getP2X()
    {
        return xP2;
    }

    /**
     * Encapsulation for the abscissa of the third point
     * @author Ishak Moali
     */
    public double getP3X()
    {
        return xP3;
    }

    /**
     * Encapsulation for the abscissa of the fourth point
     * @author Ishak Moali
     */
    public double getP4X()
    {
        return xP4;
    }

    /**
     * Encapsulation for the ordinate of the first point
     * @author Ishak Moali
     */
    public double getP1Y()
    {
        return yP1;
    }

    /**
     * Encapsulation for the ordinate of the second point
     * @author Ishak Moali
     */
    public double getP2Y()
    {
        return yP2;
    }

    /**
     * Encapsulation for the ordinate of the third point
     * @author Ishak Moali
     */
    public double getP3Y()
    {
        return yP3;
    }

    /**
     * Encapsulation for the ordinate of the fourth point
     * @author Ishak Moali
     */
    public double getP4Y()
    {
        return yP4;
    }
    
}