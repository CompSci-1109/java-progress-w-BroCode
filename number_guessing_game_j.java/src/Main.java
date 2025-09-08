import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int human_num=0;
        int comp_num;
        int tries= 0;

        Scanner mortal_guess = new Scanner(System.in);
        Random chip_guess = new Random();

        System.out.println("-------------NUMBER GUESSING GAME-------------");
        System.out.println("Welcome.....to the caves of the Intelligent One.");
        System.out.println("His brains and circuits hold a number........known to none.");
        System.out.println("Those who shall guess the number correctly....shall rule these caves!");
        System.out.println("Are you ready for the challenge, O Traveller?");

        System.out.println("Let the Games begin.");

        comp_num = chip_guess.nextInt(1, 51);

        while (human_num != comp_num) {

            System.out.println("Pick any number from 1 to 50.");
            human_num = mortal_guess.nextInt();
            tries++;

            if (human_num < comp_num) {
                System.out.println("The Liege comments: Too less, O Seeker. Try Again 😏");
            } else if (human_num > comp_num) {
                System.out.println("The Sith scoffs: Too High, huh? That's an ambitious one. Keep Trying.🙂‍↔️");
            }
            else {
                System.out.println("You....WIN!! 🎉🎊🥳");
                System.out.println("Your guess was: "+ human_num);
                System.out.println("You won in "+ tries+ "attempts.");
                System.out.println("The Sith accedes: You....are the One.");
                System.out.println("The Sith says: You are, From Now On 👑, the Jedi of The Realm. May the Force Be With You.");
            }
        }

    }
}