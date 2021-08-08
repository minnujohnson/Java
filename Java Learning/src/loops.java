import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
//        IFLOOP
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }

//        WHILE LOOP

        boolean isrepeat = true;
        while(isrepeat)
        {
            System.out.println("Play current song");
            System.out.println("Would you like to play next song? if then type yes");
            Scanner input = new Scanner(System.in);
            String act = input.next();
            if(act.equals("yes"))
            {
                isrepeat = false;
            }


        }
        System.out.println("Play next song");
    }
}
