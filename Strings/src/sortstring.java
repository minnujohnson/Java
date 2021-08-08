import java.util.Scanner;
public class sortstring {
    public static void sorting(char[] arr)
    {
        int size=arr.length;
        for(int i=0;i<=size-2;i++)
        {
            int min=i;
            for(int j=i+1;j<=size-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            char temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int p=0;p<size;p++)
        {
            System.out.println(arr[p]);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter string1");
        Scanner ip=new Scanner(System.in);
        String str1=ip.nextLine();
        System.out.println("Enter string2");
        String str2=ip.nextLine();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        sorting(ch1);
        sorting(ch2);
        String str3=new String(ch1);
        String str4=new String(ch2);
        if (str3.equals(str4)) {

            System.out.println("Permutation");
        }
        else
        {
            System.out.println("not");
        }

    }
}
