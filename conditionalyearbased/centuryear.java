import java.util.Scanner;
public class centuryear {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%100==0) 
            System.out.println("it is a centuryear");
            else
                System.out.println("not a century year");
        
    }
}
