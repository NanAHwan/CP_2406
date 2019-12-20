import java.util.*;
public class DemoRocks
{
    public static void main(String[] args)
    {
        Rock r1 = new Rock(104, 2.5);
        IgneousRock r2 = new IgneousRock(203, 14.9);
        SedimentaryRock r3 = new SedimentaryRock(302, 20.3);
        MetamorphicRock r4 = new MetamorphicRock(401, 8.0);
        display(r1);
        display(r2);
        display(r3);
        display(r4);
    }
    public static void display(Rock r)
    {
        System.out.println("\nSample # " + r.getSampleNumber() + " weighs "+
                r.getWeight());
        System.out.println("Description:   " + r.getDescription());
    }
}