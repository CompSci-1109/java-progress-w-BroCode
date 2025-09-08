/*🎲 Random

Generate:
A random integer between 1–100.
A random boolean.
A random double between 0 and 1.
import java.util.Random; */

//import java.util.Scanner;
import java.util.Random;
public class mini_task_5 {

    public static void main(String[]args){

        Random rand_obj = new Random();
//        int random_num = rand_obj.nextInt(1,101);
//
//        System.out.print("Randomly generated num is: " + random_num);

//        boolean random_state= rand_obj.nextBoolean();
//
//        System.out.print("Randomly generated state is: "+ random_state);

        double random_points= rand_obj.nextDouble(0,1);
        System.out.printf("Randomly generated point is: %.2f ",random_points);;
    }

}
