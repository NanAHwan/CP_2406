import java.util.Scanner;
public class AscendingAndDescending
{
    public static void main(String args[])
    {
        Scanner enterNum = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int num1 = enterNum.nextInt();
        int num2 = enterNum.nextInt();
        int num3 = enterNum.nextInt();
        int temp;
        if(num2 < num1 || num3 < num1)
        {
            if (num2 < num1)
            {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num3 < num1)
            {
                temp = num1;
                num1 = num3;
                num3 = temp;
            }
        }
        if(num3 < num2)
        {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " "+num2+" "+num3);
    }
}
