import java.util.Scanner;
public class digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter :");
        char c=sc.next().charAt(0);
        if(c>='0' && c<='9')
            System.out.println("it is digit");
        else
            System.out.println("it is not digit");
    }
}

