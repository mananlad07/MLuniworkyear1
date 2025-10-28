import java.util.Scanner;
public class subPalindrome
{
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    String longestPalindrome(String str)
    {
        String palindrome = "";
        String s = "@";
        for(char c : str.toCharArray())
        {
            s += "#" + c;
        }
        s += "#$";
        int n = s.length();
        int[] rad = new int[n];
        int l = 0, r =0 ;
        for(int i = 1; i < n-2;i++)
        {

        }
        return palindrome;
    }
}
