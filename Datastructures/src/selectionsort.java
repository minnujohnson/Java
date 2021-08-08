public class selectionsort {

    public static void selection(int arr[])
    {

        for(int i=0;i<=arr.length-2;i++)
        {
           int index1=i;
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[index1]>arr[j])
                {
                    index1=j;
                }
            }
            int temp=arr[index1];
            arr[index1]=arr[i];
            arr[i]=temp;
        }
    }


    public static void main(String[] args)
    {
        int arr[]={10,5,8,7,2};
        System.out.println("The array is :" );
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
        selection(arr);
        System.out.println("The sorted array is: " );
        for(int m=0;m<arr.length;m++)
        {
            System.out.println(arr[m]);
        }

    }
}
