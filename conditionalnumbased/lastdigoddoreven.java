import java.util.Scanner;
public class lastdigoddoreven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        a=a%10;
        if((a&1)==0)
            System.out.println("this is even num");
        else
            System.out.println("this is odd");
    }
}
