import java.util.Scanner;
public class charisvowelorcons {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter any character:");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("its is vowels");
        else
        System.out.println("its not vowels");
    }
}
