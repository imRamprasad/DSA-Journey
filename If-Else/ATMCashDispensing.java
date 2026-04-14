import java.util.Scanner;

public class ATMCashDispensing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=20000;
        int _100=0;
        int _2000=0;
        int _500=0;
        int a = sc.nextInt();
        if(a%100==0){
                if(a>=2000){
                    b-=a;
                    _2000=a/2000;
                    a%=2000;
                } 
                if(a>=500){
                    b-=a;
                    _500=a/500;
                    a%=500;
                }
                if(a>=100){
                    b-=a;
                    _100=a/100;
                    a%=100;
                }
    }else
        {
            System.out.println(a+" is not multiples of 100");
        }
        System.out.println("2000 "+_2000);
        System.out.println("500 "+_500);
        System.out.println("100 "+_100);
        System.out.println("Balance "+b);
    }
}