public class TestFactorials
{
    public static void main (String args[])
    {
        final int MAX = 10;
        int factorial;
        for (int i = 1; i <= MAX; i++)
        {
            System.out.println("Before i: "+i);
            factorial = i;
            System.out.println("After f:"+factorial);
            for(int j = i - 1; j > 0; --j)
                System.out.println("j:"+j);
//                factorial = factorial * j;
//            System.out.println("The factorial of " + i +
//                    " is " + factorial);
        }
    }
}

