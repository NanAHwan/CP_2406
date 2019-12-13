import java.util.*;
public class ValidatePassword
{
    public static void main(String[] args)
    {
        String aString;
        int sLength;
        final int NUM = 2;
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int letterCount = 0;
        Scanner in = new Scanner(System.in);
        int numSpaces = 0;
        System.out.print("Please enter a password that included at least two uppercase, lowercase, digits >> ");
        aString = in.nextLine();
        sLength = aString.length();

        for(int i = 0; i < sLength; i++)
        {
            char c = aString.charAt(i);
            if(Character.isUpperCase(c))
                upperCount++;
            else if(Character.isLowerCase(c))
                lowerCount++;
            else if(Character.isDigit(c))
                digitCount++;
        }
        if(upperCount >= NUM && lowerCount >= NUM && digitCount >= NUM)
            System.out.println("Valid password");
        else
        {
            System.out.println("The password did not have enough of the following:");
            if(upperCount < NUM)
                System.out.println("uppercase letters");
            if(lowerCount < NUM)
                System.out.println("lowercase letters");
            if(digitCount < NUM)
                System.out.println("digits");
        }
    }
}