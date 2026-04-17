import java.util.Scanner;
public class CountDigitOccurrences {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.print("Enter the rep number:");
        int rep=sc.nextInt();
        System.out.println(countDigit(num,rep));

    }
    public static int countDigit(int a,int b){
        int count=0;
        while(a>0){
            int temp=a%10;
            if(temp==b){
                count++;
            }
            a/=10;
        }
        return count;
    }
}
