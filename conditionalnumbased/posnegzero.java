import java.util.Scanner;
public class posnegzero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num:");
        int n=sc.nextInt();
        if(n==0)
            System.out.println("given num is zero");
        else if(n<0)
            System.out.println("the given num is negative");
        else
            System.out.println("the given num is positive");
    }
}
