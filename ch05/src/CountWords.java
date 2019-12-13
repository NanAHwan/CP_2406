import java.util.*;
public class CountWords
{
    public static void main(String[] args)
    {
        String str;

        char ch;
        int i, length;
        int count = 0;
        boolean isPunc = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string >> ");
        str = in.nextLine();
        length = str.length();
        for(i = 0; i < length; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ' || ch == '.' || ch == ';' || ch == ',' ||
                    ch == '!' || ch == '-')
            {
                ++count;
                if(isPunc)
                    --count;
                isPunc = true;
            }
            else
                isPunc = false;
        }
        if(!isPunc)
            ++count;

        System.out.println("There are " + count + " words in the string");
    }
}