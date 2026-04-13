import java.util.Scanner;
public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1th subject :");
        double a=sc.nextDouble();
        System.out.print("Enter the 2th subject :");
        double b=sc.nextDouble();
        System.out.print("Enter the 3th subject :");
        double c=sc.nextDouble();
        double d=percentage(a,b,c);
        if(d>=90){
            System.out.println("Grade: A");
        }else if(d>=80){
            System.out.println("Grade: B");
        }else if(d>=70){
            System.out.println("Grade: C");     
        }else if(d>=60){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }
    }
    public static double percentage(double a, double b,double c){
        return ((a+b+c)/300)*100;
    }


}