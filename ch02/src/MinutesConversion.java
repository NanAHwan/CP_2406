import java.util.Scanner;

public class MinutesConversion {

    private static Scanner inputMinute;

    public static void main(String[] args) {
        int minutes, hours;
        float days;

        inputMinute = new Scanner(System.in);
        System.out.println("Please enter minutes for conversion >> ");
        minutes = inputMinute.nextInt();
        hours = minutes / 60;
        days = hours / 24.0f;


        System.out.println("\nThe minutes " + minutes + " you entered is " + hours + " hour(s) and " + days + " days(s). ");


    }

}