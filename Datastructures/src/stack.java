class stack {
    int N=10;
    int top;

    int arr[]=new int[10];
    stack()
    {

        top=-1;
    }
    void push(int x)
    {
        if(top>N-1)
        {
            System.out.println("stack overfolw");
        }
        else
        {
            arr[++top]=x;
            System.out.println(x + "pushed" + top);

        }
    }

    void pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            int k=arr[top--];
           System.out.println(k + "popped");
        }
    }
    public static void main(String[] args)
    {

        stack st=new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
    }
}
