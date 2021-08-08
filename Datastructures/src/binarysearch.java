import java.util.Scanner;
public class binarysearch {

    public static int search(int arr[],int min,int max,int key) {

        int mid = (min + max) / 2;

        while (max >= min) {

            if (key == arr[mid]) {
                System.out.println("Element found at " + mid);
                break;
            }
            if (key < arr[mid]) {
                max = mid - 1;
                return search(arr, 0, max, key);
            } else {
                min = mid + 1;
                return search(arr, min, max, key);
            }

        }
        return 0;

    }
    public static void main(String[] args)
    {
        System.out.println("The array is :");
        int arr[]={10,20,30,40,50,};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the value to be serached");
        Scanner input=new Scanner(System.in);
        int key=input.nextInt();
        int max=arr.length-1;
        int min=0;
        search(arr,0,max,key);
    }
}
