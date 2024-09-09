import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int usersGuess = -1;
        int numberToGuess = rand.nextInt(1, 11);
        int tries = 0;

        System.out.println("Gæt et tal mellem 1-10.");

        while(numberToGuess != usersGuess){
            usersGuess = scanner.nextInt();
            tries++;

            if(usersGuess > numberToGuess) {
                System.out.println("Forkert gættet.");
                System.out.println("Du skal gætte lavere.");
            } else if(usersGuess < numberToGuess){
                System.out.println("Forkert gættet.");
                System.out.println("Du skal gætte højere.");
            }
        }

        System.out.println("Du gættede rigtigt.");
        System.out.println("Du var " + tries + " om at gætte nummeret.");
    }
}
