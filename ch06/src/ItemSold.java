public class ItemSold
{
    private int invoiceNumber;
    private String description;
    private double price;
    public void setInvoiceNumber(int n)
    {
        invoiceNumber = n;
    }
    public void setDescription(String d)
    {
        description = d;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public int getInvoiceNumber()
    {
        return invoiceNumber;
    }
    public String getDescription()
    {
        return description;
    }
    public double getPrice()
    {
        return price;
    }
}