public class App
{

    public static void main(String[] args)
    {
        int n;
        int x = 1;
        int y = 1;
        int total = 0;

        n = 0;

        while(n < 4_000_000)
        {
            n = x + y;
            //System.out.println(n + " ");
            if(n % 2 == 0)
            {
                total = total + n;
            }
            x = y;
            y = n;
        }

        System.out.println("The sum of the pair numbers in the Fibonacci's sequence < 4 000 000 = " + total);
    }
}