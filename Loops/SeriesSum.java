import java.util.Scanner;
                                 //SeriesSum(9+99+999...)
public class SeriesSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int count=0;
        int b=9;
        int sum=0;
        while(count<a){
            sum+=b;
            b=(b*10)+9;
            count++;
        }
        System.out.println(sum);

    }
}
