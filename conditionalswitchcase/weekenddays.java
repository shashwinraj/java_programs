import java.util.Scanner;
public class weekenddays {
 public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a) {
            case 7:case 1:
                System.out.println("weekend");
                break;

           // case 1:
               // System.out.println("weekend");
               // break;

           

            default:
                System.out.println("weekdays");
        }
    }
}
    
