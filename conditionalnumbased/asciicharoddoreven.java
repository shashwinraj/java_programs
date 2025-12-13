import java.util.Scanner;
public class asciicharoddoreven {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a character:");
        char ch=sc.next().charAt(0);
        int ascii=(int)ch;
        if(ch%2==0)
            System.out.println("the given char ascii is even");
        else
            System.out.println("the given char ascii value is odd");
    }
}
