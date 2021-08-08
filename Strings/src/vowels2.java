import java.util.Scanner;
public class vowels2 {
    public static void main(String[] args)
    {
int counta=0,counte=0,counti=0,counto=0,countu=0;
        System.out.println("enter String");
        Scanner ip=new Scanner(System.in);
        String str=ip.next();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {

            if(ch[i]=='a')
            {
                counta=counta+1;
            }
            else if(ch[i]=='e')
            {
                counte=counte+1;
            }
            else if(ch[i]=='i')
            {
                counti=counti+1;
            }
            else if(ch[i]=='o')
            {
                counto=counto+1;
            }
            else if(ch[i]=='u')
            {
                countu=countu+1;
            }
        }
        System.out.println("a: " +counta);
        System.out.println("e: " +counte);
        System.out.println("i: " +counti);
        System.out.println("o: " +counto);
        System.out.println("u: " +countu);


    }
}
