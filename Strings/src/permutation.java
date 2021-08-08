import java.util.Scanner;
import java.util.Arrays;
public class permutation {
    public static void sorting (char arr[])
    {
     Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args)
    {
        int count=0;
        System.out.println("Enter the first string");
        Scanner ip=new Scanner(System.in);
        String str1=ip.next();
        System.out.println("Enter the second string");
        String str2=ip.next();
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
      sorting(ch1);
      String sorted1=new String(ch1);
        sorting(ch2);

        String sorted2=new String(ch2);
        if(sorted1.equals(sorted2))
        {
            System.out.println("permutation");
        }
        else
        {
            System.out.println("not");

        }
    }
}
