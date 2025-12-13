
import java.util.Scanner;
public class priceaftdis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Original Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        double amount = price - (price * discount / 100);

        System.out.println("Price After Discount = "+amount);
    }

}