import java.util.Scanner;
public class factorial {
    public static int fact(int N)
    {
        if(N==0)
        {
            return 1;
        }
        else
        {
         return N*fact(N-1);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner ip=new Scanner(System.in);
        int N=ip.nextInt();
        //Recursion
        System.out.println("Factorial is" + fact(N));
        //Iteration
        System.out.println("Enter number");
        int S=ip.nextInt();
        int result=1;
        for(int i=1;i<=S;i++)
        {

          result=result*i;

        }
        System.out.println("Factorial is" + result);
    }
}
