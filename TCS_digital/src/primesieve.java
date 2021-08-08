import java.util.Scanner;
public class primesieve {
    public static void main(String[] args)
    {
        int count=0;
        System.out.println("Enter the lower range");
        Scanner ip=new Scanner(System.in);
        int l=ip.nextInt();
        System.out.println("Enter the upper range");
        int u=ip.nextInt();
        boolean arr[]=new boolean[u];

        for(int i=2;i*i<=u;i++)
        {
            if(arr[i]==false)
            {
            for(int j=2*i;j<u;j+=i) {

                arr[j] = true;
            }

            }
        }
        for(int p=l;p<u;p++) 
        {
            if(arr[p]==false)
            {
                System.out.print(p +"\t");
                count=count+1;
            }
        }

    }

}
