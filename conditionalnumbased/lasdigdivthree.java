import java.util.Scanner;
public class lasdigdivthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int m = n % 10;

        if(m % 3 == 0)
            System.out.println("it is divisible by 3");
        else
            System.out.println("it cant divisible by 3");
    }
}

