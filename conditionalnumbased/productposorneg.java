import java.util.Scanner;
public class productposorneg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st num:");
        int a=sc.nextInt();
        System.out.print("enter 2nd num:");
        int b=sc.nextInt();
        int c=a*b;
        if(c<0)
            System.out.println("it is negative");
            else
                System.out.println("it is positive");
        
    }
}
