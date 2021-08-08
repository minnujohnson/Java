import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {int n=0,c=0;
        System.out.println("Enter string");
        Scanner ip=new Scanner(System.in);
        String str=ip.next();
        char[] ch=str.toCharArray();
        String str1=new String();
        for(int i=ch.length-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        if(str.equals(str1)) {
            System.out.println(str + " is palindrome");
        }
        System.out.println("Enter a number");
        int num=ip.nextInt();
        int temp=num;
        while(num>0)
        {
            n=num%10;
            c=c*10+n;
            num=num/10;

        }
        if(c==temp)
        {
            System.out.println(temp + "is palindrome");
        }
        else
        {
            System.out.println(temp + "is not palidrome");
        }
    }
}
