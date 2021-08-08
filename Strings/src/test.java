import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
        int count=0;

        System.out.println("siz of array");
        Scanner ip=new Scanner(System.in);
        int N=ip.nextInt();
        float[] brr=new float[N];
        float[] arr=new float[N];
        for(int a=0;a<N;a++)
        {
            arr[a]=ip.nextInt();
        }
        for(int b=0;b<N;b++) {
            if (arr[b] != 142) {
                count = count + 1;

                brr[b] = arr[b];
            }}
        for(int i=0;i<N-2;i++)
        {
            int min=i;
            for(int j=i+1;j<N-1;j++)
            {
                if(brr[j]>brr[min])
                {
                    min=j;
                }
            }
            float temp=brr[i];
            brr[i]=brr[min];
            brr[min]=temp;

        }
        for(int p=0;p<3;p++)
        {
           System.out.println(brr[p]);
        }




    }
}
