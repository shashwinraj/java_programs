import java.util.Scanner;
public class distravelled {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("speed:");
        int speed=sc.nextInt();
        System.out.println("time:");
        int time=sc.nextInt();
        double distance=speed*time;
        System.out.println(distance);

    }
}
