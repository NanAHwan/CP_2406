public class TestPatient {
    public static void main(String[] args)
    {
        Patient test1 = new Patient();
        System.out.println("Patient Identification: " + test1.getPatientIdentification());
        System.out.println("Patient Age: " + test1.getPatientAge());
        System.out.println("Blood Type: " + test1.getPatientBloodData("O"));
        System.out.println("RH Factor: " + test1.getPatientBloodData('-'));
    }
}

