
    import java.util.Scanner;
    public class mock1
    {
        public static void main(String[] args)
        {
            Scanner ip=new Scanner(System.in);
            int N=ip.nextInt();
            float[] arr=new float[N];
            for(int i=0;i<N;i++)
            {
                float k=ip.nextFloat();
                arr[i]=k;
            }
            if(N<4)
            {
                System.out.println("INVALID INPUT");
            }
            for(int p=0;p<=N-2;p++)
            {
                int min=p;
                for(int q=p+1;q<=N-1;q++)
                {
                    if(arr[min]>arr[q])
                    {
                        min=q;
                    }
                }
                float temp=arr[p];
                arr[p]=arr[min];
                arr[min]=temp;
            }
            for(int z=0;z<N;z++) {
                System.out.println(arr[z]);
            }
            float a=arr[N-1];
            float b=arr[N-2];
            float c=arr[N-3];
            float d=arr[N-4];
            float total=a*b*c*d;
            System.out.println(total);
        }
    }


