public class DiagonalOs
{
    public static void main(String[] args)
    {
        final char SHOW_CHAR = 'O';
        final char SPACE = ' ';
        final int ROWS = 10;
        int steps = 0;
        int i, j;
        for(i = 0; i < ROWS; ++i)
        {
            for(j = 0; j < steps; ++j)
                System.out.print(SPACE);
            System.out.println(SHOW_CHAR);
            steps++;
        }
    }
}