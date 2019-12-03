import java.util.Scanner;
public class MetricConversion
{
    private static Scanner inputValue;

    public static void main(String[] args)
    {
        int value;
        inputValue = new Scanner(System.in);
        System.out.println("Please enter a value to convert: ");
        value = inputValue.nextInt();
        conventsInchesToCentimeters(value);
        conventsGallonsToLiters(value);
    }
    public static void conventsInchesToCentimeters(int value)
    {
        System.out.println("The inches "+ value+ " have been converted into "+value*2.54 +"centimeters.");
    }
    public static void conventsGallonsToLiters(int value)
    {
        System.out.println("The gallons "+ value+ " have been converted into "+value*3.7854 +"liters.");
    }
}
