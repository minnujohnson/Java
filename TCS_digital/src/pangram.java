import java.util.Scanner;
public class pangram {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        int[] arr = new int[26];
        int index=0;
        int flag=0;
        String str1=str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {

            if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') {
                index = str1.charAt(i) - 'A';

            }
            arr[index] = 1;
        }
        for(int j=0;j<26;j++) {
            if (arr[j] == 0) {
                flag = 1;
            }

        }
        if(flag==1) {
            System.out.println(str + "is not a pangram");
        }
        else
        {

            System.out.println(str + "is  a pangram");
        }
    }}