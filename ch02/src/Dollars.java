import javax.swing.JOptionPane;
public class Dollars
{
    public static void main(String[] args)
    {
        String totalDollarsString;
        int totalDollars;
        totalDollarsString = JOptionPane.showInputDialog(null, "Enter amount to be     converted", "Denomination Conversion", JOptionPane.INFORMATION_MESSAGE);
        totalDollars = Integer.parseInt(totalDollarsString);
        int twenties = totalDollars / 20;
        int remainderTwenty = (totalDollars % 20);
        int tens = remainderTwenty / 10;
        int remainderTen = (totalDollars % 10);
        int fives = remainderTen / 5;
        int remainderFive = (totalDollars % 5);
        int ones = remainderFive / 1;
        JOptionPane.showMessageDialog(null, "Total Entered is $" + totalDollarsString + "\n" + "\nTwenty Dollar Bills: " + twenties + "\nTen Dollar Bills: " + tens + "\nFive Dollar Bills: " + fives + "\nOne Dollar Bills: " + ones);
        int selection;
        boolean isYes, isNo;
        selection = JOptionPane.showConfirmDialog(null,
                "Is this how you wanted the total broken down?", "Select an Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "You responded " + isYes + "\nThanks for your response!");
        isNo = (selection == JOptionPane.NO_OPTION);
        int twenties2 = totalDollars / 20;
        int tens2 = totalDollars / 10;
        int fives2 = totalDollars / 5;
        int ones2 = totalDollars / 1;
        JOptionPane.showMessageDialog(null, "Total Entered is $" + totalDollarsString + "\n" + "\nTwenty Dollar Bills: " + twenties2 + "\nTen Dollar Bills: " + tens2 + "\nFive Dollar Bills: " + fives2 + "\nOne Dollar Bills: " + ones2);
    }
}