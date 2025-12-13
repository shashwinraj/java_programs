import java.util.Scanner;
public class buy5pay3pens{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int pens=sc.nextInt();
        int amt=sc.nextInt();
        int div=(pens/5)*2;
        int payable=div*totalamt;
        System.out.println(payable);

    }
}
