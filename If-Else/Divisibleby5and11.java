import java.util.Scanner;
public class Divisibleby5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println(a+" is divisible by both 5 and 11");
        }else if(a%5==0){
            System.out.println(a+" is divisible by 5");   
        } else if(a%11==0){
            System.out.println(a+" is divisible by 11");
        }else{
            System.out.println(a+" is not divisible by either 5 or 11");
        }
        sc.close();
    }
}