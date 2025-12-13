import java.util.Scanner;
public class validdaysyearmnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();

        if (month <=1 || month >=12) {
            System.out.println("Invalid Month");
        }
        else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                 month == 8 || month == 10 || month == 12) {
            System.out.println("31 Days");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days");
        }
        else if (month == 2) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                System.out.println("29 Days");
            else
                System.out.println("28 Days");
        }
    }
}
