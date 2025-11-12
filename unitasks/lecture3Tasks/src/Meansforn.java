import static java.lang.Math.*;



// Generalise Exercise 2 for n integers: the arithmetic mean of a1,a2,...,an is a1+a2+···+an
// ,
// their geometric mean is (a1a2 ···an)1
// n. Your two methods must take an array as pa
//rameter. Compare the arithmetic mean and the geometric mean of 45, 3, 12, 6
public class Meansforn
{
    int[] array = {45, 3, 12, 6};
    public void main()
    {
        System.out.println(arithMean(array));
        System.out.println(geomMean(array));
    }
    public double arithMean(int[] numArray)
    {
        int sum = 0;
        for(int num : numArray)
        {
            sum += num;
        }
        return (sum/numArray.length);
    }
    public double geomMean(int[] numArray)
    {
        int sum = 1;
        for (int num : numArray)
        {
            sum = sum * num;
        }
        return pow(sum, (double)1/numArray.length);
    }
}
