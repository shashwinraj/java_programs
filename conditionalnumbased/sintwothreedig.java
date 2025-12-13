import java.util.Scanner;
public class sintwothreedig{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        if((n>=0)&&(n<10))
            System.out.println("single digit");
        else if((n>=10)&&(n<99))
            System.out.println("2 digits");
        else
            System.out.println("3 digits");
    }
}