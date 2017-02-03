import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userInput = "yes";
        System.out.println();


        do {
            int die1 = getDiceSize();

            rollDice(die1);


            System.out.println("Play again?");
            //input.nextLine();
            String userinput2 = input.nextLine();
        }

        while (userInput.equalsIgnoreCase("yes"));
        return;



    }

    private static void rollDice(int die1) {
        System.out.println("Roll the Dice!");

        Random rn = new Random();
        int max = die1;
        int snakeeyes = 1;
        int boxCars = 6;
        int craps7 = 7;
        int craps11 =11;

        int result1 = rn.nextInt(max + 1);
        int result2 = rn.nextInt(max + 1);

        if (result1 == snakeeyes && result2 == snakeeyes) {
            System.out.println("Snake Eyes you loose ");
        }
        else if (result1 == craps7|| result1 ==craps11)  {

        }

        else if (result1 == boxCars && result2 == boxCars) {
            System.out.println("box Cars Baby!");

        }


       else  {
            System.out.println("your first dice was " + result1);
            System.out.println("your second dice was " + result2);
        }

    }

    private static int getDiceSize() {
        Scanner input = new Scanner(System.in);
        System.out.println("what size of dice would you like to use?");

        int die1 = input.nextInt();
        input.nextLine();
        int die2 = die1;
        return die1;
    }
}
