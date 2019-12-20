import java.util.*;
public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();

        item1.setInvoiceNumber(0001);
        item1.setDescription("Dog Bed");
        item1.setPrice(50);

        item2.setInvoiceNumber(0002);
        item2.setDescription("Cat Cage");
        item2.setPrice(30);

        pet1.setInvoiceNumber(0003);
        pet1.setDescription("Labrador");
        pet1.setPrice(600);
        pet1.setIsVaccinated(true);
        pet1.setIsNeutered(true);
        pet1.setIsHousebroken(true);

        pet2.setInvoiceNumber(0004);
        pet2.setDescription("Persian cat");
        pet2.setPrice(500);
        pet2.setIsVaccinated(true);
        pet2.setIsNeutered(false);
        pet2.setIsHousebroken(true);

        display(item1);
        display(item2);

        display(pet1);
        displayPetData(pet1);

        display(pet2);
        displayPetData(pet2);
    }
    public static void display(ItemSold item)
    {
        System.out.println("Invoice #" + item.getInvoiceNumber());
        System.out.println("     Description: " + item.getDescription());
        System.out.println("     Price: $" + item.getPrice());
    }
    public static void displayPetData(PetSold item)
    {
        System.out.println("     Vaccinated is " + item.getIsVaccinated());
        System.out.println("     Neutered is " + item.getIsNeutered());
        System.out.println("     Housebroken is " + item.getIsHousebroken());
    }
}