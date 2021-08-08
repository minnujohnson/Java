public class operations {
    public static void main(String[] args)
    {
        //length
        String str1=new String("Hello World");
        String str2=new String("I am Minnu");
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str1+str2);
//isempty
        String empty="";
        System.out.println(empty.isEmpty());
        String empty1="  ";
        System.out.println(empty1.isEmpty());
//charAt
        String s="Minnu";
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(4));
//equals
        String s1=new String("Jerin");
        System.out.println(s1.equals("Jerin"));
        System.out.println(s1.equals("Minnu"));
//compareto
        System.out.println(s1.compareTo(s));
        String s2="Jerin";
        System.out.println(s2.compareTo(s1));
//starts and ends with
        System.out.println(s1.startsWith("J"));
        System.out.println(s1.startsWith("r",2));
        System.out.println(s1.startsWith("P"));
        System.out.println(s1.endsWith("n"));
        System.out.println(s1.endsWith("r"));
//substring
String str3="Hello World I am Minnu";
        System.out.println(str3.substring(5));
System.out.println(str3.substring(0,5));
        System.out.println(str3.substring(6,11));
        System.out.println(str3.substring(str3.length()-4));
//contains
String a="Education";

        System.out.println(a.contains("duca"));
        System.out.println(a.concat("nice"));
//uppercase&lowercase
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
    }
}
