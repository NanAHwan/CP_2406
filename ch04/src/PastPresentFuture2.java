import java.util.*;
import java.time.LocalDate;
public class PastPresentFuture2
{
    public static void main(String args[])
    {
        int month,day,year;
        LocalDate today=LocalDate.now();

        Scanner input=new Scanner(System.in);
        System.out.print("Please enter month:");
        month=input.nextInt();
        System.out.print("Please enter day:");
        day=input.nextInt();
        System.out.print("Please enter year:");
        year=input.nextInt();
        LocalDate inputDate = null;
        try
        {
            inputDate = LocalDate.of(year,month,day);

        }
        catch(Exception e)
        {
            /*if the entered day,month & year are not converted to a date object because of invalid entry of any values, we are stopping the program.*/
            System.out.println("You entered invalid integers, please enter again!");
            System.exit(0);
        }
        System.out.print("The date you entered is ");
        if(inputDate.isBefore(today))
            System.out.println("in the past.");
        else
        if(inputDate.isAfter(today))
            System.out.println("in the future.");
        else
        if(inputDate.equals(today))
            System.out.println("the current date.");


    }
}