import java.util.Scanner;
public class ReverseNumberPalindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int tem=a;
        int rev=0;
        while(tem>0){
            rev=rev*10+(tem%10);
            tem/=10;
        }
        System.out.println(rev);
        System.out.println(a);
        
    }
}
