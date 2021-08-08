import java.util.Scanner;
public class vowels {
    public static void main(String[] args)
    {
        int count=0;
        System.out.println("Enter String");
        Scanner ip=new Scanner(System.in);
        String str=ip.next();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u'||ch[i]=='i')
            {
                count=count+1;
            }
            }
        System.out.println("total " + count + "vowels" );
        }


    }

