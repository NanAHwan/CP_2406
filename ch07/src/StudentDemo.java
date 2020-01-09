public class StudentDemo
{
    public static void main(String[] args)
    {
        Student students[] = new Student[6];
        int i;
        students[0] = new UndergraduateStudent("111", "Student1");
        students[1] = new UndergraduateStudent("222", "Student2");
        students[2] = new GraduateStudent("333", "Student3");
        students[3] = new GraduateStudent("444", "Student4");
        students[4] = new StudentAtLarge("555", "Student5");
        students[5] = new StudentAtLarge("666", "Student6");
        for(i = 0; i < students.length; ++i)
            System.out.println("\nStudent # " +
                    students[i].getId() + " Name: " +
                    students[i].getLastName() + "  Tuition: " +
                    students[i].getTuition() + " per year");
    }
}