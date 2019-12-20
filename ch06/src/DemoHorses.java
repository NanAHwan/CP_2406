public class DemoHorses
{
    public static void main(String args[])
    {
        Horse h1 = new Horse();
        RaceHorse h2 = new RaceHorse();

        h1.setName("Lightning");
        h1.setColor("write");
        h1.setBirthYear(2018);
        h2.setName("Flash");
        h2.setColor("black");
        h2.setBirthYear(2010);
        h2.setRaces(2);
        System.out.println(h1.getName() + " is " + h1.getColor() + " and was born in " + h1.getBirthYear() + ".");
        System.out.println(h2.getName() + " is " + h2.getColor() + " and was born in " + h2.getBirthYear() + ".");
        System.out.println(h2.getName() + " has been competed in " + h2.getRaces() + " races.");
    }
}