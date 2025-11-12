import java.util.Scanner;
public class Means
{
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    public void main()
    {
        System.out.println("The arithmetic mean of your two numbers are " + arithMean(n1, n2));
        System.out.println("The geometric mean of your two numbers are " + geoMean(n1, n2));
    }
    public double arithMean(int num1, int num2)
    {
        return (double) (num1 + num2) /2;
    }
    public double geoMean(int num1, int num2)
    {
        return Math.sqrt(num1 * num2);
    }
}