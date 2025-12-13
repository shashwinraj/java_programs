
import java.util.Scanner;

public class fstlastsamedig {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int a=sc.nextInt();
        System.out.print("enter number:");
        int b=sc.nextInt();
        a=a%10;
        b=b%10;
        if(a==b)
            System.out.println("yes both digits are same");
        else
            System.out.println("not same digits");
    }
}

