public class queue {
    int N=10;
    int arr[]=new int[N];
    int head;
    int tail;
    void queue()
    {
        head=0;
        tail=0;
    }
    void enqueue(int x)
    {
     if(head==0&&tail>=N)
     {
         System.out.println("queue is full");
     }
     else
     {
         arr[tail]=x;
         System.out.println(x + "is added at" + tail);
         tail++;
     }
    }
    void display()
    {
        for(int i=head;i<tail;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void deque()
    {
        if(head<0) {
            System.out.println("Queue is empty");
        }
        else
        {
            int j=arr[head];
            System.out.println(j + "is removed");
            head++;
        }
    }
    public static void main(String[] args)
    {
        queue q=new queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.deque();
        q.deque();
        q.display();
    }
}
