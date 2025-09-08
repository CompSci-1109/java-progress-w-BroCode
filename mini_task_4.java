/*☕ JAVA MINI TASKS
📝 Basics + If Statements
Ask for user’s age. If under 18, print "You are a minor", else "You are an adult"*/
import java.util.Scanner;

public class mini_task_4 {
    public static void main(String[]args){

        Scanner sc_obj = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age= sc_obj.nextInt();

        if ( age < 1 || age >100){
            System.out.print(("Invalid age."));
        }
        else if(age < 18) {
            System.out.print("You are a Minor!");
        }
        else if (age>=18 ){
            System.out.print("You are an adult.");
        }

        sc_obj.close();

    }
}
