import java.util.Scanner;
public class matrixadd {
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter row size");
        int row=ip.nextInt();
        System.out.println("Enter col size");
        int col=ip.nextInt();
        int arr[][]=new int[row][col];
        int brr[][]=new int[row][col];
        int crr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=ip.nextInt();
            }
        }
        for(int p=0;p<row;p++) {
            for (int q = 0; q < col; q++) {
                System.out.print(arr[p][q] + " ");
            }
            System.out.println();
        }
        for(int a=0;a<row;a++)
        {
            for(int b=0;b<col;b++)
            {
                brr[a][b]=ip.nextInt();
            }
        }
        for(int p=0;p<row;p++) {
            for (int q = 0; q < col; q++) {
                System.out.print(brr[p][q] + " ");
            }
            System.out.println();
        }
        for(int p=0;p<row;p++)
        {
            for(int q=0;q<col;q++)
            {
                crr[p][q]=arr[p][q]+brr[p][q];
            }
        }
        System.out.println("Result matrix is :");
        for(int p=0;p<row;p++)
        {
            for(int q=0;q<col;q++)
            {
                System.out.print(crr[p][q] + " ");
            }
            System.out.println();
        }
        //multiplication
        int drr[][]=new int[row][col];

        for(int p=0;p<row;p++)
        {
            for(int q=0;q<col;q++)
            {
                for(int k=0;k<row;k++)
                {
                    drr[p][q]=drr[p][q]+arr[p][k]*brr[k][q];
                }

            }
        }
        System.out.println("Result matrix is :");
        for(int p=0;p<row;p++)
        {
            for(int q=0;q<col;q++)
            {
                System.out.print(drr[p][q] + " ");
            }
            System.out.println();
        }

    }

}
