import java.util.Scanner;
public class summation
{
    Scanner sc=new Scanner(System.in);
    int n;
    int sum;
    public void main(String[] args)
    {
        n = sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
