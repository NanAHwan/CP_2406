import javax.swing.*;
public class CarCareChoice
{
    public static void main (String[] args)
    {
        boolean isMatch = false;
        String[] items =  { "Oil change", "Tire rotation",
                "Battery check", "Brake inspection"};
        int[] prices = {25, 22, 15, 5};
        int i;
        int index = 0;
        String menu = "Enter selection:";
        for(i = 0; i < items.length; ++i)
            menu += "\n   " + items[i];
        String selection = JOptionPane.showInputDialog(null, menu);
        for (i = 0; i < items.length; i++)
            if(selection.equals(items[i]))
            {
                isMatch = true;
                index = i;
            }
        if(isMatch)
            JOptionPane.showMessageDialog(null,
                    selection + " price is $" + prices[index]);
        else
            JOptionPane.showMessageDialog(null, "Invalid Entry");
    }
}