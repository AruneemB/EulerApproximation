import java.util.*;

public class EulerApproximation
{
    public static int EulerApproximationFactorial(int n)
    {
        if(n == 1) return 1;
        return n * EulerApproximationFactorial(n - 1);
    }

    public static double EulerApproximationSeries(int numberOfTerms)
    {
        double EulersNumber = 0.0;
        if(numberOfTerms <= 1) return 1.0;
        for(int i = 0; i < numberOfTerms; i++)
        {
            EulersNumber += (1.0/EulerApproximationFactorial(numberOfTerms - i));
        }
        return EulersNumber + 1.0;
    }

    public static void main(String[] args)
    {
        System.out.println("Euler's Number Approximation");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Euler's Number can be approximated as a series of the inverse of the factorial of index 'n,' representing the number of terms in the series.");
        System.out.println("Listed below are partial summations of the series by the number of terms in the series:");
        System.out.println();
        for(int i = 1; i <= 20; i++)
        {
            if(i != 1)
            {
                System.out.println("Approximation of Euler's number with " + i + " terms in the series: " + EulerApproximationSeries(i));
            }
            else
            {
                System.out.println("Approximation of Euler's number with " + i + " term in the series: " + EulerApproximationSeries(i));
            }
        }
    }
}
