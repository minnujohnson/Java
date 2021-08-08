import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int t1=0,t2 = 1;

        System.out.println("Enter the number");
        Scanner ip = new Scanner(System.in);

        int n=ip.nextInt();
        System.out.print(t1 +" " +t2+ " ");
        for(int i=1;i<n;i++){
            int num=t1+t2;
            t1=t2;
            t2=num;
            System.out.print(num + "\t");

        }
    }}
