import java.util.Scanner;
public class fstoddoreven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("given 3 numbers:");
        int a=sc.nextInt();
        a=a/100;
       if ((a&1)==0)
        System.out.println("the given num is even");
       else
        System.out.println("it is odd number");
    }
}
