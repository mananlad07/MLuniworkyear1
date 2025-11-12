public class Sportperson
{
    String name;
    String sport;
    int age;
    public Sportperson(String Name, String Sport)
    {
        this.name = Name;
        this.sport = Sport;
        this.age = 0;
    }
    public void increaseAge()
    {
        age++;
    }

}
