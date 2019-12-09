import java.lang.*; 

public class App
{
    public static void main(String[] args)
    {
        int sumOfMultiplesOfThree = 0;
        int sumOfMultiplesOfFive = 0;

        for (int i = 0 ; i < 1000 ; i++)
        {
            if (i % 3 == 0) 
            {
                sumOfMultiplesOfThree = sumOfMultiplesOfThree + i;
            }

            if (i % 5 == 0) 
            {
                sumOfMultiplesOfFive = sumOfMultiplesOfFive + i;
            }
        }

        System.out.println("The sum of all the multiples of 3 or 5 < 1000 = " + (sumOfMultiplesOfThree + sumOfMultiplesOfFive));
    }
}