import java.util.Scanner;
public class armstrong {
    public static void main(String[] args)
    {
        int temp;
        int a=0;
        int c=0;
        System.out.println("enter a number");
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        temp=num;
        while(num>0)
        {
            a=num%10;
            c=c+(a*a*a);
            num=num/10;
        }
        if(temp==c)
        {
            System.out.println(temp + "is a armstrong number");

        }
        else
        {
            System.out.println(temp + "is not a armstrong");
        }
    }

}
