import java.util.Scanner;
public class passfail {
 public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a / 7) {
            case 7:
                System.out.println("Distinction");
                break;

            case 6:
                System.out.println("A");
                break;

            case 5:
                System.out.println("B");
                break;

            case 4:
            case 3:
                System.out.println("C");
                break;

            default:
                System.out.println("Fail");
        }
    }
}
    
