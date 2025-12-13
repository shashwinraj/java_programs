import java.util.Scanner;
public class last2digaresame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
       int year2=sc.nextInt();

        int firstTwo = year % 100;
        int lastTwo = year % 100;

        if (firstTwo == lastTwo)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}


