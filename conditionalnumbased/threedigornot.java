import java.util.Scanner;
public class threedigornot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>99&&a<=999)
            System.out.println("3digits");
        else
            System.out.println("no 3 digit");
    }

}
