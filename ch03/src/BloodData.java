public class BloodData
{
    private String bloodType;
    private char rhFactor;
    public BloodData()
    {
        bloodType = "O";
        rhFactor = '+';
    }
    public BloodData(String type, char factor)
    {
        bloodType = type;
        rhFactor = factor;
    }
    public void setBloodType(String type)
    {
        this.bloodType = type;
    }
    public void setRhFactor(char factor)
    {
        this.rhFactor = factor;
    }
    public String getBloodType()
    {
        return bloodType;
    }
    public char getRhFactor()
    {
        return rhFactor;
    }



}
