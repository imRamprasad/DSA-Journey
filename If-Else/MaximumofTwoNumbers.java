import java.util.Scanner;
public class MaximumofTwoNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b){
            System.out.println("A is Greater then "+b);
        }else{
            System.out.println("B is Greater then "+a);
        }
    }
}