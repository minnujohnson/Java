import java.util.Scanner;
public class unique {
    public static void main(String[] args)
    {
        int count=0;
        System.out.println("Enter the lower range");
        Scanner ip=new Scanner(System.in);
        int l=ip.nextInt();
        System.out.println("Enter the upper range");
        int u=ip.nextInt();


        for(int i=l;i<=u;i++) {
            int num = i;
            int arr[]=new int[10];
            while (num > 0) {

                int x = num % 10;
                if (arr[x] == 1) {
                    break;
                } else {
                    arr[x] = 1;

                }
                num = num / 10;
            }
            if (num == 0) {
                count = count + 1;
            }
        }
        if(count>0)
        {
            System.out.println("total " +count+"unique digits are in th range");
        }
        else
        {
            System.out.println("no unique digits");
        }
    }

}
