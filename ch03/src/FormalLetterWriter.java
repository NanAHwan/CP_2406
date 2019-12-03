import javax.swing.text.StyledEditorKit;

public class FormalLetterWriter
{
    public String firstName, lastName;

    public void displaySalutation(String last)
    {
        lastName = last;
        System.out.println("Dear Mr. or Ms. "+lastName);
    }
    public void displaySalutation(String first, String last)
    {
        firstName = first;
        lastName = last;
        System.out.println("Dear "+firstName+" "+lastName);
    }
    public void displayLetter()
    {
        System.out.println("Thank you for your recent order.");
    }
    public static void main(String[]args)
    {
        FormalLetterWriter greet1 = new FormalLetterWriter();
        FormalLetterWriter greet2 = new FormalLetterWriter();
        greet1.displaySalutation("Smith");
        greet1.displayLetter();
        greet2.displaySalutation("Smile","Smith");
        greet2.displayLetter();
    }
}
