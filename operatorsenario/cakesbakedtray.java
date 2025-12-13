import java.util.Scanner;
public class cakesbakedtray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int trays=sc.nextInt();
        int cakes=sc.nextInt();
        System.out.println(trays*cakes+ ": total no cakes");
    }
}
