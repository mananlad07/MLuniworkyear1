import java.util.Scanner;
public class palindrome
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(palindromeCheck(word.toLowerCase()));
    }
    public boolean palindromeCheck(String ogWord)
    {
        boolean isPalindrome = true;
        int left = 0, right = ogWord.length() - 1;
        while (left < right)
        {
            if (ogWord.charAt(left) != ogWord.charAt(right))
            {
                isPalindrome = false;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }

}