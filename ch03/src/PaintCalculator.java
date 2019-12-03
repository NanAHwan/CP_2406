import java.nio.charset.CharsetEncoder;
import java.util.Scanner;
public class PaintCalculator
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double wallArea;
        double height;
        double length;
        double width;
        double price;
        double WallArea;
        double paintQuantity;

        System.out.print("Please enter the height of the room: ");
        height = keyboard.nextDouble();

        System.out.print("Please enter the length of the room: ");
        length = keyboard.nextDouble();

        System.out.print("Please enter the width of the room: ");
        width = keyboard.nextDouble();

        wallAreaMethod(height, length, width);
    }
    public static double wallAreaMethod(double height, double length, double width)
    {
        double wallArea;
        wallArea = length * height * width * height;
        return wallArea;
    }
    public static double paintFormula(double wallAreaMethod, double price, double height, double length, double width)
    {
        double wallArea;
        double paintQuantity;
        paintQuantity = wallAreaMethod * 2 / 350;
        System.out.println("For a room of height "+height+"feet, length "+length+"feet, and width "+width+" feet you need to purchase "+paintQuantity+"gallons of paint.");
        System.out.println("The price will be $"+ price+".");
        price = paintQuantity * 32.0;
        return price;
    }
}
