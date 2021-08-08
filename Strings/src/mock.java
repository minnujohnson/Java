
    import java.util.Scanner;
    public class mock {
        public static void main(String[] args)


        {
           int temp=0;
            System.out.println("Enter size");
            Scanner ip= new Scanner(System.in);
            int N=ip.nextInt();
            System.out.println("Enter distance covered");
            float arr[]=new float[N];
            for(int i=0;i<N;i++)
            {
                float K=ip.nextFloat();
                arr[i]=K;
            }

                for(int j=0;j<=N-2;j++) {
                    int min = j;
                    for (int p=j+1;p<=N-1;p++) {
                        if (arr[p] < arr[min]) {
                            min = p;
                        }

                    }
                    float tem = arr[j];
                    arr[j] = arr[min];
                    arr[min] = tem;

                }
            for(int z=0;z<N;z++) {
                System.out.println(arr[z]);
            }
            for(int a=N-1;a>=0;a--)
            {
                if(arr[a]!=42.195&&temp<3)
                {
                    System.out.println(arr[a]);

                }
            }

            }


        }

