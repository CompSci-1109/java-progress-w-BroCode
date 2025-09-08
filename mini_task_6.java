/*🧮 Math Class

Take a double input and print:
Square root
Power (raise to 3)
Absolute value
Max of two numbers */

import java.util.Scanner;
public class mini_task_6 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        double num;
        double square_root;
        double pwr;
        double abs;

        System.out.print("Enter any number:");
        num= sc.nextDouble();

        square_root= Math.sqrt(num);
        System.out.printf("\nThe squareroot of the number is: %.2f", square_root);

        pwr=Math.pow(num,3);
        System.out.printf("\nThe power of the number raised to 3  is: %.2f", pwr); //-no.: left align

        abs=Math.abs(num);
        System.out.printf("\nThe absolute value of the number raised to 3  is: %10.2f",abs); //no.: right align

        sc.close();
    }

}
