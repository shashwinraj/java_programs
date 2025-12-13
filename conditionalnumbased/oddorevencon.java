import java.util.Scanner;
public class oddorevencon {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a&1)==0)
            System.out.println(a+" " + "even");
        else
            System.out.println(a+" " + "odd");

    }
}
