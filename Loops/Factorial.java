import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=1;
        for(int i=1;i<=num;i++){
            sum*=i;
        }
        System.out.println(sum);


    }
}
