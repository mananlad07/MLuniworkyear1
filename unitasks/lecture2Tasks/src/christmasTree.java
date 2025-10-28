import java.util.Scanner;
public class christmasTree
{
    Scanner sc=new Scanner(System.in);
    String star = "*";
    int height;
    public void main()
    {
        //take height then make first star with height amount of spaces then remove a space and add 2 stars
        height = sc.nextInt();
        for (int i = 0; i < height; i++)
        {
            String spaces = "";
            for (int j = 0; j <= height - i; j++)
            {

                spaces += " ";
            }
            System.out.println(spaces + star);
            star += "**";
        }
    }
}
// may be incomplete due to lack of debugging