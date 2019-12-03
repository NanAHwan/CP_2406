import java.util.Scanner;
public class InchesToFeetInteractive
{
    private static Scanner inputInches;
    public static void main(String[] args)
    {
        final int ONE_FEET = 12;
        int calculatedInches;
        int feet;
        int inches;
        inputInches = new Scanner(System.in);
        System.out.println("Please enter inches for calculation: ");
        inches = inputInches.nextInt();

        feet = inches / ONE_FEET;
        calculatedInches = inches % ONE_FEET;
        System.out.print("The "+inches+" is equal to "+ feet + " feet and "+ calculatedInches + " inches.");
    }
}
