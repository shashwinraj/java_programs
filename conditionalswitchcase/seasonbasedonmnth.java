import java.util.Scanner;
public class seasonbasedonmnth {
 public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a) {
            case 12:case 1:case 2:
                System.out.println("Winter");
                break;

            case 3:case 4:case 5:
                System.out.println("summer");
                break;

            case 6:case 7:case 8:case 9:
                System.out.println("rainy season");
                break;

            case 10:case 11:
                System.out.println("autumn");
                break;

            default:
                System.out.println("invalid month");
        }
    }
}
    

