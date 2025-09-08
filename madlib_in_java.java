import java.util.Scanner;

public class madlib_in_java {

    public static void main (String[]args){

        Scanner scan_gram = new Scanner(System.in);

      String noun1;
      String adj1;
      String verb1;
      String noun2;
      String adj2;
      String verb2;

        System.out.print("Enter the  first adjective: ");
        adj1= scan_gram.nextLine();
        System.out.print("Enter the  first Noun: ");
        noun1= scan_gram.nextLine();
        System.out.print("Enter the  second adjective: ");
        adj2=scan_gram.nextLine();
        System.out.print("Enter the  second Noun: ");
        noun2= scan_gram.nextLine();
        System.out.print("Enter the  first verb: ");
        verb1= scan_gram.nextLine();
        System.out.print("Enter the  second verb: ");
        verb2= scan_gram.nextLine();

        System.out.println("Today I went to a/an "+ adj1 +" "+ noun1 + ".");
        System.out.println("While I was there, I saw a " + adj2 + " " + noun2 + " that could " + verb1 + ".");
        System.out.println("I couldn’t believe my eyes, so I decided to " + verb2 + " as fast as I could!");
    }
}
