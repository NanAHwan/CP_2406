public class InchesToFeet
{
    public static void main(String[]args)
    {
        int inches = 86;
        final int ONE_FEET = 12;
        int calculatedInches;
        int feet;
        feet = inches / ONE_FEET;
        calculatedInches = inches % ONE_FEET;
        System.out.print("The "+inches+" is equal to "+ feet + " feet and "+ calculatedInches + " inches.");
    }

}
