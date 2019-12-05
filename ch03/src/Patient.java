public class Patient
{
    private int patientIdentification;
    private int patientAge;
    private BloodData patientBloodData;
    public Patient()
    {
        patientIdentification = 0;
        patientAge = 0;
        setPatientBloodData(new BloodData("O", '-'));
        class BloodData
        {
            String type;
            char factor;
            public BloodData(String typ, char fact)
            {
                type = typ;factor = fact;
            }
        }
    }
    public Patient(int id, int age, String type, char factor)
    {
        patientIdentification = id;
        patientAge = age;
        BloodData patientBloodData= new BloodData("O", '+');
    }
    public int getPatientIdentification()
    {
        return patientIdentification;
    }
    public int getPatientAge()
    {
        return patientAge;
    }
    public String getPatientBloodData(String type)
    {
        return type;
    }
    public char getPatientBloodData(char factor)
    {
        return factor;
    }
    public BloodData getPatientBloodData()
    {
        return patientBloodData;
    }
    public void setPatientBloodData(BloodData patientBloodData)
    {
        this.patientBloodData = patientBloodData;
    }
}

