import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the range :");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<num;i++){
            int sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;

        }
    }
}
