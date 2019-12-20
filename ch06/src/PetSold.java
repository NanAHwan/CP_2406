public class PetSold extends ItemSold
{
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHousebroken;
    public void setIsVaccinated(boolean v)
    {
        isVaccinated = v;
    }
    public void setIsNeutered(boolean n)
    {
        isNeutered = n;
    }
    public void setIsHousebroken(boolean h)
    {
        isHousebroken = h;
    }
    public boolean getIsVaccinated()
    {
        return isVaccinated;
    }
    public boolean getIsNeutered()
    {
        return isNeutered;
    }
    public boolean getIsHousebroken()
    {
        return isHousebroken;
    }
}