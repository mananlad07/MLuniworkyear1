void main()
{
    Car car1 = new Car("Nisan", 0, 0);
    System.out.println(car1.model);
    System.out.println(car1.speed);
    car1.updateSpeed(40);
    System.out.println(car1.speed);
}