//Mini Task 1: Ask user their name and age, and print a greeting.

import java.util.Scanner;

public class mini_tasks_one {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter your name: ");
        name =scanner.nextLine();

        System.out.print("Enter your Age: ");
        age =scanner.nextInt();

        System.out.printf("Hi, %s! You are %d years old",name,age);

        scanner.close();
    }
}
