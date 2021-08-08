import java.util.Scanner;
public class mocktest {

        public static void mara(float[] R, int N) {

            for(int i=0;i<=R.length-2;i++)
            {
            int index1=i;
            for(int j=i+1;j<=R.length-1;j++)
            {
                if(R[index1]>R[j])
                {
                    index1=j;
                }
            }
            float temp=R[index1];
            R[index1]=R[i];
            R[i]=temp;
        }


        }


        public static void result(float R[], int N) {
            System.out.println("Enter the last 3 racers distance covered");
            for(int a=R.length;a>0;a--) {

                while (a < R.length - 3&&a>R.length-7) {
                    System.out.println(R[a]);
                         break;

                }
            }
        }

            public static void main(String[] args)
            {
                System.out.println("Enter size of array");
                Scanner ip = new Scanner(System.in);
                int N = ip.nextInt();
                float R[] = new float[N];

                System.out.println("Enter the participants list :");

                for (int i = 0; i < N; i++) {

                    float input = ip.nextFloat();
                    R[i] = input;
                }
                mara(R, N);
                System.out.println("the sorted array is:");
                for (int k = 0; k < N; k++) {
                    System.out.println(R[k]);
                }
                result(R, N);


        }
    }



