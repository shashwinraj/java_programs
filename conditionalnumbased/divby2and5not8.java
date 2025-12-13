
import java.util.Scanner;

public class divby2and5not8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int a=sc.nextInt();
        if((a%2)==0 && (a%5)==0 && (a%8)!=0)
            System.out.println("yes it is divsible by 2 and 5 not with 8");
        else
            System.out.println("it cant divsible by 2 and 5 but with 8");
    }
}

