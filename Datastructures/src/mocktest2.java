import java.util.Scanner;

 public class mocktest2
    {


    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array :");
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        float A[]=new float[N];
        System.out.println("Enter numbers");
        for(int i=0;i<N;i++)
        {
            float k=input.nextFloat();
            A[i]=k;
        }
        if(N<4)
        {
            System.out.println("Invalid input");
        }
        for(int i=0;i<=A.length-2;i++)
        {
            int index1=i;
            for(int j=i+1;j<=A.length-1;j++)
            {
                if(A[index1]>A[j])
                {
                    index1=j;
                }
            }
            float temp=A[index1];

            A[index1]=A[i];
            A[i]=temp;
        }
        System.out.println("sorted array is");
        for(int q=0;q<N;q++)
        {
            System.out.println(A[q]);
        }
        float b=A[N-1];
        float c=A[N-2];
        float d=A[N-3];
        float e=A[N-4];
        float P=b*c*d*e;

        System.out.println("The output is" + P);



    }
}

