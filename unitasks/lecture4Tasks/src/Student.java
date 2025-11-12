public class Student
{
    String name;
    int IDnumber;
    int[] marks;
    public Student(String Name, int IDNumber)
    {
        this.name = Name;
        this.IDnumber = IDNumber;
        this.marks = new int[10];
        for (int i=0;i<marks.length;i++)
        {
            marks[i]=0;
        }
    }
    public void updateMarks(int i, int marks)
    {
        this.marks[i] = marks;
    }
    public int lowMarks()
    {
        int n=0;
        for (int result : marks)
        {
            if (result < 40)
            {
                n++;
            }
        }
        return n;
    }

}
