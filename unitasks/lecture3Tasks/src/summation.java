import java.util.Scanner;

public class summation
{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    public void main()
    {
        sumLoop(num);
        System.out.println(sumRecursive(num));
    }
    public int sumRecursive(int n)
    {
        if (n <= 0)
        {
            return 0;
        }
        else
        {
            return n + sumRecursive(n - 1);
        }
    }
    public void sumLoop(int n)
    {
        int total = 0;
        if (n <= 0)
        {
            return;
        }
        else
        {
            for (int i = 1; i <= n; i++)
            {
                System.out.print((total += i) + " ");
            }
        }
    }
}
