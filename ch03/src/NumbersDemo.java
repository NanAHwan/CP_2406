public class NumbersDemo
{
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
        int num1 = 1, num2 = 2;
        displayTwiceTheNumber(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num1);
        displayNumberPlusFive(num2);
        displayNumberSquared(num1);
        displayNumberSquared(num2);
    }

}
