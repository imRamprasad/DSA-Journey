import java.util.Scanner;
public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the a value:");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("a is a positive + number");
        }else if (a<0){
            System.out.println("a is negitive - number");
        }else{
            System.out.println("a is 0");
        }
        sc.close();
    }
}