public class insertionsort {

    public static void insertion(int arr[])
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>current)
            {
                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=current;
        }
    }


    public static void main(String[] args)
    {
        System.out.println("the input array is :");
        int arr[]={10,8,7,1,5};
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
        insertion(arr);
        System.out.println("The sorted array is :");
        for(int l=0;l<arr.length;l++)
        {
            System.out.println(arr[l]);
        }

    }
}
