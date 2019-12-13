import java.util.*;
public class DistanceFromAverage
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[20];
        double inputNum;
        double total = 0;
        double average = 0;
        final int QUIT = 99999;
        int i = 0, j;
        System.out.print("Enter a numeric value or " +
                QUIT + " to quit >> ");
        inputNum = input.nextDouble();
        while(inputNum != QUIT && i < numbers.length)
        {
            numbers[i] = inputNum;
            total += numbers[i];
            ++i;
            if(i < numbers.length)
            {
                System.out.print("Please enter next number or you can enter " +
                        QUIT + " to quit: ");
                inputNum = input.nextDouble();
            }
        }
        if(i == 0)
            System.out.println("Average cannot be computed because no numbers were entered");
        else
        {
            average = total / i;
            System.out.println("The average of the entered " + i +" numbers is " + average+".");
            for(j = 0; j < i; ++j)
                System.out.println(numbers[j] + " is " +
                        (numbers[j] - average) + " away from the average");
        }
    }
}