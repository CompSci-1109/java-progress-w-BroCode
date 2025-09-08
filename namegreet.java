
import java.util.Scanner;

public class namegreet {

    public static void main(String[]args){

        Scanner scan_obj1= new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter your name: ");
        name= scan_obj1.nextLine();

        System.out.print("Enter your age: ");
        age= scan_obj1.nextInt();

//        System.out.print("Good Evening, "+name+ "!"+" You are " +age +" years old.");
        System.out.printf("Good Evening, %s ! You are %d years old.",name,age);
    }
}
