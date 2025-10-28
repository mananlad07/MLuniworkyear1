/* import java.util.Scanner;

public class commonSubstring
{
    Scanner sc = new Scanner(System.in);
    public void main(String[] args)
    {
        int startIndex=0,substrLength=-1,temp=0;
        String str1;
        str1 = sc.nextLine();
        String str2;
        str2 = sc.nextLine();
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        for (int i=0;i<str1Array.length-1;i++)
        {
            for (int j=0;j<str2Array.length-1;j++)
            {
                if (str1Array[i]==str2Array[j])
                {
                    temp++;
                    if (temp>substrLength)
                    {
                        startIndex=i;
                    }

                }
                else
                {
                    substrLength = temp;
                    temp=0;
                }
            }
        }
        if (substrLength>0)
        {
            System.out.println(str1.substring(startIndex,startIndex+substrLength));
        }
        else
        {
            System.out.println("Nothing in common");
        }
    }
} */
// solution
import java.util.Scanner;

public class commonSubstring {
    Scanner sc = new Scanner (System.in);
    public void main (String[] args){

        String str1 = sc.next();
        String str2 = sc.next();
        search:
        for (int i = str1.length(); i > 0; i--) {
            int j = 0;
            while (i + j <= str1.length()){
                if (str2.contains(str1.substring(j, j + i))){
                    System.out.println(str1.substring(j, j + i));
                    break search;
                }
                j++;
            }
        }
    }
}