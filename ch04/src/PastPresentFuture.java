import java.util.Calendar;
import java.util.Scanner;
public class PastPresentFuture
{
    public static void main(String args[])
    {
        Calendar now = Calendar.getInstance();
        int thisYear = now.get(Calendar.YEAR);
        int thisMonth = now.get(Calendar.MONTH)+1;
        int thisDay = now.get(Calendar.DAY_OF_MONTH);
        int year, month, day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year: ");
        year = scanner.nextInt();
        System.out.println("Please enter month: ");
        month = scanner.nextInt();
        System.out.println("Please enter day: ");
        day = scanner.nextInt();
        System.out.println("MM/DD/YYYY: "+month+"/"+day+"/"+year);
        if(year < thisYear)
        {
            System.out.println("Not This Year");
        }
        else if(year==thisYear) {
            if (month < thisMonth) {
                System.out.println("In an earlier month this year.");
            } else if (month >= thisMonth) {
                System.out.println("In a later month this year.");
            } else
                System.out.println("This Month");
        }
    }
}
