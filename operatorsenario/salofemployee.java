import java.util.Scanner;

public class salofemployee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int basic = sc.nextInt();
        int pf = basic * 12 / 100;
        int net = basic - pf;

        System.out.println(net);
    }
}
