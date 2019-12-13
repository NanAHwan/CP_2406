public class TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}

