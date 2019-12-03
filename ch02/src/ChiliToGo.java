import java.util.Scanner;
public class ChiliToGo
{
    private static Scanner inputAdultMeal;
    private static Scanner inputChildMeal;
    public static void main(String[]args)
    {
        final int ADULT_MEAL = 7;
        final int CHILD_MEAL = 4;

        int numAdult, numChild, adultTotal, childTotal, bothTotal;
        inputAdultMeal = new Scanner(System.in);
        inputChildMeal = new Scanner(System.in);
        System.out.println("Please enter the number of adult meal: ");
        numAdult = inputAdultMeal.nextInt();
        System.out.println("Please enter the number of child meal: ");
        numChild = inputChildMeal.nextInt();
        adultTotal = numAdult * ADULT_MEAL;
        childTotal = numChild * CHILD_MEAL;
        bothTotal = adultTotal + childTotal;
        System.out.println("The total cost of both adult and child meal is "+ bothTotal+".");

    }


}
