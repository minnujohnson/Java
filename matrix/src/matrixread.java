import java.util.Scanner;
public class matrixread {
    public static void main(String [] args)
    {
        System.out.println("enter row size");
        Scanner ip=new Scanner(System.in);
        int row=ip.nextInt();
        System.out.println("enter col size");
        int col=ip.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=ip.nextInt();
            }
        }

        System.out.println("dispaly matrix");
        for(int a=0;a<row;a++)
        {
            for(int b=0;b<col;b++)
            {
                System.out.print(arr[a][b]+ " ");

            }
            System.out.println();
        }
    }
}
