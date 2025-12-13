import java.util.Scanner;
public class charalpha {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter :");
        char c=sc.next().charAt(0);
        if((c>='a' && c<='z')||(c>='A' && c<='Z'))
            System.out.println("it si alphabet");
        else
            System.out.println("it is not alphabet");
    }
}
