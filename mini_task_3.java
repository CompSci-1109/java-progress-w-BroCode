import java.util.Scanner;

public class mini_task_3 {

    public static void main(String[]args){

        Scanner scan_ob= new Scanner(System.in);
        int age;
        boolean isStudent;

        System.out.println("Enter ur age: ");
        age=scan_ob.nextInt();

        if(age==18){
            isStudent=true;
        }
        else{
            isStudent=false;
        }

        if(isStudent){
            System.out.println("You are eligible for 50% discount.");
        }
        else{
            System.out.println("You are not eligible for the 50% discount.");
        }
    }
}
/*
//☕ JAVA MINI TASKS
📝 Basics + If Statements
Ask for user’s age. If under 18, print "You are a minor", else "You are an adult"//

🎲 Random

Generate:
A random integer between 1–100.
A random boolean.
A random double between 0 and 1.
import java.util.Random;

🧮 Math Class

Take a double input and print:
Square root
Power (raise to 3)
Absolute value
Max of two numbers

🔠 printf()

Practice formatted printing:

System.out.printf("Integer: %d\n", 10);
System.out.printf("Float with 2 decimals: %.2f\n", 3.14159);
System.out.printf("Right aligned (width 10): %10d\n", 123);
System.out.printf("Left aligned (width 10): %-10d end\n", 123);

☕ Mini Project (Java)

Simple Guessing Game

Computer generates a random number (1–50).
User keeps guessing until correct.
After each guess, print "Too high" or "Too low".

Use:
Random class
Scanner input
If statements
Loops
Printf for nice messages*/
