import java.util.Scanner;
public class threeandfive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int a=sc.nextInt();
        if((a%3)==0 && (a%5)==0)
            System.out.println("yes it is divsible by 3 and 5");
        else
            System.out.println("it cant divsible by 3 and 5");
    }
}
