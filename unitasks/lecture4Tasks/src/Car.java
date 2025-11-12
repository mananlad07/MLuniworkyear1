public class Car
{
    String model;
    int speed = 0;
    double miles = 0;
    public  Car(String Model, int Speed, double Miles)
    {
        this.model = Model;
        this.speed = Speed;
        this.miles = Miles;
    }
    public void updateSpeed(int Speed)
    {
        this.speed = Speed;
    }
    public void updateMiles(double Miles)
    {
        this.miles = Miles;
    }
}
