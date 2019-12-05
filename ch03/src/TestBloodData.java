public class TestBloodData
{
    public static void main(String[] args)
        {
            BloodData test1 = new BloodData();
            System.out.println("Blood Type: " + test1.getBloodType());
            System.out.println("RH Factor: " + test1.getRhFactor());

            BloodData test2 = new BloodData();
            test2.setBloodType("A");
            test2.setRhFactor('-');
            System.out.println();

            System.out.println("Blood Type: " + test2.getBloodType());
            System.out.println("RH Factor: " + test2.getRhFactor());
            System.out.println();

            BloodData test3 = new BloodData("B", '+');
            System.out.println("Blood Type: " + test3.getBloodType());
            System.out.println("RH Factor: " + test3.getRhFactor());
        }
}
