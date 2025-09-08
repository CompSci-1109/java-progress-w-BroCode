import java.util.Scanner;

public class java_shop_cart {

    public static void main(String[]args){

        Scanner scan_obj=new Scanner(System.in);

        String Product;
        double Price;
        int quantity;
//        double total;

        System.out.print("What are you buying?: ");
        Product= scan_obj.nextLine();

        System.out.print("What is its price?: ");
        Price= scan_obj.nextDouble();

        System.out.print("No. of the products you're buying?: ");
        quantity= scan_obj.nextInt();

        System.out.print("So your total purchase is ");
//        total= scan_obj.nextLine();
    }
}
