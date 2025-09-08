import java.util.Scanner;

public class compound_interest_calc {

    public static void main(String []args){

        System.out.println("----------COMPOUND INTEREST CALCULATOR----------");

        Scanner scan_obj = new Scanner(System.in);
          double principle;
          double rate;
          int time;
          int no_of_elapse;
          double final_amount;

          System.out.print("Enter your principle: ");
          principle= scan_obj.nextDouble();

          System.out.print("Enter your rate: ");
          rate= scan_obj.nextDouble()/ 100;

          System.out.print("Enter your time: ");
          time= scan_obj.nextInt();

          System.out.println("Enter your Number of interest elapse: ");
          no_of_elapse= scan_obj.nextInt();

          final_amount= principle * Math.pow((1+rate/no_of_elapse), no_of_elapse*time);

        System.out.printf("Your Final amount is: $%.2f", final_amount);
        scan_obj.close();

    }
}
