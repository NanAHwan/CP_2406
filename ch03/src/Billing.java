public class Billing
{

    private float photoBookPrice = 0;
    private int photoBooks = 1;
    private final int taxPercent = 8;
    private float couponValuePercent=0;
    private float totalDue=0;

    public Billing(float photoBookPrice)
    {
        this.photoBookPrice = photoBookPrice;
        totalDue = calculateOneBookPrice();
    }

    public Billing(float photoBookPrice, int photoBooks)
    {
        this(photoBookPrice);
        this.photoBooks = photoBooks;
        totalDue = calculateBooksPrice();
    }

    public Billing(float photoBookPrice, int photoBooks, float couponValuePercent) {
        this(photoBookPrice, photoBooks);
        this.couponValuePercent = couponValuePercent;
        totalDue = calculateBooksPriceWithCoupon();
    }

    private float calculateOneBookPrice()
    {
        return photoBookPrice + (0.08f * photoBookPrice);
    }

    private float calculateBooksPrice()
    {
        return calculateOneBookPrice() * photoBooks;
    }

    private float calculateBooksPriceWithCoupon()
    {
        return  (calculateOneBookPrice() * photoBooks) - couponValuePercent;
    }

    public static void main(String[] args) {

        Billing bill1 = new Billing(250);
        Billing bill2 = new Billing(250,4);
        Billing bill3 = new Billing(250,12,2.5f);


        System.out.println("________Billing 1_________");
        System.out.println(bill1.toString());
        System.out.println("________Billing 2_________");
        System.out.println(bill2.toString());
        System.out.println("________Billing 3_________");
        System.out.println(bill3.toString());

    }



    public float getTotalDue()
    {
        return totalDue;
    }

    public float getPhotoBookPrice()
    {
        return photoBookPrice;
    }

    public void setPhotoBookPrice(float photoBookPrice)
    {
        this.photoBookPrice = photoBookPrice;
    }

    public int getPhotoBooks()
    {
        return photoBooks;
    }

    public void setPhotoBooks(int photoBooks)
    {
        this.photoBooks = photoBooks;
    }

    public float getCouponValuePercent() {
        return couponValuePercent;
    }

    public void setCouponValuePercent(float couponValuePercent)
    {
        this.couponValuePercent = couponValuePercent;
    }

    public int getTaxPercent()
    {
        return taxPercent;
    }

    @Override
    public String toString() {
        return "Billing [photoBookPrice=" + photoBookPrice + ", photoBooks="
                + photoBooks + ", taxPercent=" + taxPercent
                + ", couponValuePercent=" + couponValuePercent + ", totalDue="
                + totalDue + "]";
    }




}