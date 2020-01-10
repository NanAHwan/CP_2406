import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel msg1 = new  JLabel("To be or not to be,");
    JLabel msg2 = new JLabel("that is the question.");
    public JBookQuote()
    {
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(msg1);
        add(msg2);
    }
    public static void main(String[] args)
    {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(300, 150);
        aFrame.setVisible(true);
    }
}