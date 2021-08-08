import java.util.Scanner;
public class Candlies {
    public static void main(String[] args)
    {
        System.out.println("size of jar");
        Scanner ip=new Scanner(System.in);
        int N=ip.nextInt();
        System.out.println("Input");
        int I=ip.nextInt();
        if(I==0)
        {
            System.out.println("Invalid input");
        }
        System.out.println("Sold" + I);
        int P= N-I;
        System.out.println("Available"+P);
        if(P<=5)
        {
            int K=P+(N-P);
            System.out.println(K);
        }
    }
}
