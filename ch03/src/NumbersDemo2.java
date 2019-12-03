import java.util.Scanner;
public class NumbersDemo2
{
    private static Scanner inputNumber;

    public static void displayTwiceTheNumber(int num)
    {
        for (int i=0; i<2;i++)
        {
            System.out.println(num);
        }
    }
    public static void displayNumberPlusFive(int num)
    {
        int plusFive = num + 5;
        System.out.println(plusFive);
    }
    public static void displayNumberSquared(int num)
    {
        System.out.println(num = num * num);

    }
    public static void main(String[]args)
    {
        int num;
        inputNumber = new Scanner(System.in);
        System.out.println("Please enter number to display: ");
        num = inputNumber.nextInt();
        displayTwiceTheNumber(num);
        displayNumberPlusFive(num);
        displayNumberSquared(num);
    }
}
