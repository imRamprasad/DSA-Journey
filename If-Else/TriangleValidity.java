import java.util.Scanner;
public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1th side :");
        double a=sc.nextDouble();
        System.out.print("Enter the 2th side :");
        double b=sc.nextDouble();
        System.out.print("Enter the 3th side :");
        double c=sc.nextDouble();
        triangleValid(a,b,c);
    }
    public static void triangleValid(double a,double b,double c){
        if(a+b>c && a+c>b && b+c>a){
            System.out.println(a+" "+b+" "+c+" is a valid Triangle");
        }else{
            System.out.println(a+" "+b+" "+c+" is a not a valid Triangle");
        }
    }


}