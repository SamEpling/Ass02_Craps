import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean doneWithGame = false;
        boolean doneWithProgram = false;
        int dieOne = 0;
        int dieTwo = 0;
        int total = 0;
        int point = 0;
        while (!doneWithProgram) {
            doneWithGame = false;
            dieOne = rnd.nextInt(6) + 1;
            dieTwo = rnd.nextInt(6) + 1;
            total = dieOne + dieTwo;
        if ((total == 7) || (total == 11)) {
            System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ", so a total of " + total + ", which means you win with a natural!");
            doneWithGame = true;
        }
        else if ( (total == 2) || (total == 3) || (total == 12) ) {
            System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ", so a total of " + total + ", which means you crapped out and lose!");
            doneWithGame = true;
        }
        else {
            System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ", so a total of " + total + ", which is the new point!");
            point = total;
        }
        while (!doneWithGame) {
            dieOne = rnd.nextInt(6) + 1;
            dieTwo = rnd.nextInt(6) + 1;
            total = dieOne + dieTwo;
            if (total == 7) {
                System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ", so a total of " + total + ", which means you lose!");
                doneWithGame = true;
            }
            else if (total == point) {
                System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ", so a total of " + total + ", which equals the point, so you win!");
                doneWithGame = true;
            }
            else {
                System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ", so a total of " + total + ", which is not 7 or " + point + ", so you roll again!");
            }
        }
            if (!SafeInput.getYNConfirm(in, "Would you like to play again? ")) {
                doneWithProgram = true;
            }
        }
    }
}