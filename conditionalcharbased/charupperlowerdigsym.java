import java.util.Scanner;
public class charupperlowerdigsym {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter:");
    char ch=sc.next().charAt(0);
    if(ch>='a' && ch<='z')
        System.out.println("it is a character");
    else if(ch>='A' && ch<='Z')
        System.out.println("it is a character");
    else if(ch>='0' && ch<='9')
        System.out.println("it is a character");
    else
        System.out.println("symbols");
 }   
}
