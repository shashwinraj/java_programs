import java.util.Scanner;
public class buy3get1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mang=sc.nextInt();
        int price=sc.nextInt();
        int free=mang/4;
        int payable=mang-free;
        int totalamt=payable*price;
        System.out.println(totalamt);
    }
}
