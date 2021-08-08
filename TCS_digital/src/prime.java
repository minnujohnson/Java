import java.util.Scanner;
public class prime {
    public static void main(String[] args)
    {
        int flag=0;
        System.out.println("number") ;
    Scanner ip=new Scanner(System.in);
    int N=ip.nextInt();
    if(N==0||N==1)
    {
        System.out.println("not prime") ;
    }
    else
    {
        for(int i=2;i<=N/2;i++)
        {
            if(N%i==0)
            {
                System.out.println("not prime") ;
                flag=1;
            }

        }
        if(flag==0)
        {
            System.out.println("prime number") ;
        }
    }

    }
}
