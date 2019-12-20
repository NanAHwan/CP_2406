public class DemoCandles
{
    public static void main(String args[])
    {
        Candle normalCandle = new Candle();
        ScentedCandle scentedC = new ScentedCandle();
        normalCandle.setColor("Blue");
        normalCandle.setHeight(5);

        scentedC.setColor("White");
        scentedC.setScent("Apple");
        scentedC.setHeight(5);
        System.out.println("The " + normalCandle.getHeight() + " inches " + normalCandle.getColor() +
                " candle costs $" + normalCandle.getPrice());
        System.out.println("The " + scentedC.getHeight() + " inches " + scentedC.getScent() + " " + scentedC.getColor() +
                " candle costs $" + scentedC.getPrice());
    }
}