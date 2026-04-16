import java.util.Scanner;
                                 //123=1^3+2^3+3^3
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int actualValue=num;
        int sum=0;
        int digitCount=(int)(Math.log10((double) num))+1;
        for(int i=0;i<(int)digitCount;i++){
            sum+=Math.pow((num%10),digitCount);
            num/=10;
        }
        if(sum==actualValue){
            System.out.println("this is a Amstrong number");
        }else{
            System.out.println("this is Not a Amstrong number");
        }

    }
}
