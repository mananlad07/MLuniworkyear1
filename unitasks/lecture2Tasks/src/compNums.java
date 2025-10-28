import java.util.Scanner;
public class compNums
{
    Scanner sc = new Scanner(System.in);
    int num1, num2;

    public void main()
    {
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num1 > num2)
        {
            System.out.println("first number greater");
        }
        else
        {
            System.out.println("second number greater");
        }
    }

}