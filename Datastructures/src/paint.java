import java.util.Scanner;
public class paint {
    public static void main(String[] args)
    {
        double SA=0;
        double SA1=0;
        System.out.println("Enter the interior walls");
        Scanner ip=new Scanner(System.in);

        int in=ip.nextInt();
        float arr[]=new float[in];
        System.out.println("Enter the exterior walls");
        int out=ip.nextInt();
        float arr1[]=new float[out];
        if(in>0) {
            System.out.println("Enter the surface area of interior walls");
            for(int i=0;i<in;i++)
            {
                float k=ip.nextFloat();
                arr[i]=k;
                SA=SA+(k*18);

            }

        }
        if(out>0) {
            System.out.println("Enter the surface area of exterior walls");
            for(int j=0;j<out;j++)
            {
                float p=ip.nextFloat();
                arr1[j]=p;
                SA1=SA1+(p*12);

            }
        }

        double total=SA+SA1;
        System.out.println("Cost" + total);



    }
}
