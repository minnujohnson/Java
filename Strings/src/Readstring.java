import java.util.Scanner;
public class Readstring{
    public static void main(String[] args)
    {
        char[] a={'h','e','l','l','o'};
        String str=new String(a);
        System.out.println(str);
        Scanner ip=new Scanner(System.in);
        String st=ip.next();
        System.out.println(str + st);


    }
}
