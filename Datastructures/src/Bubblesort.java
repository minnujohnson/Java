import java.util.Scanner;
public class Bubblesort
{
public static void bubble(int[] arr)
{
for (int k=0;k<=arr.length-2;k++)
{
    for(int j=0;j<=arr.length-2-k;j++)
    {
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
        }
    }

}

}


    public static void main(String[] args)
    {

        System.out.println("Input values to the array arr ");
        Scanner value0=new Scanner(System.in);
        int A0=value0.nextInt();
        Scanner value1=new Scanner(System.in);
        int A1=value1.nextInt();
        Scanner value2=new Scanner(System.in);
        int A2=value2.nextInt();
        Scanner value3=new Scanner(System.in);
        int A3=value3.nextInt();
        Scanner value4=new Scanner(System.in);
        int A4=value1.nextInt();
        int arr[] = {A0,A1,A2,A3,A4};
        System.out.println("The array is :" );
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

bubble(arr);
        System.out.println("Array after bubble sort: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}

