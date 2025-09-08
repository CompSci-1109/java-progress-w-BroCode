import java.util.Scanner;

public class Java_day_1
{
    public static void main(String[] args)
    {
        double length;
        double width;
        double area;

        Scanner scan_inp1= new Scanner(System.in);
        System.out.print("Enter the length: ");
        length= scan_inp1.nextDouble();

        System.out.print("Enter the width: ");
        width= scan_inp1.nextDouble();

        area= length*width;

        scan_inp1.close();
        System.out.println("The Area is: "+ area);
    }
}
