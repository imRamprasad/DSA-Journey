import java.util.Scanner;
public class APSeriesSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Starting of Ap Series:");
       int  start=sc.nextInt();
        System.out.print("Enter the number of items from AP Series:");
        int  items=sc.nextInt();
        System.out.print("Enter the number of common difference of  AP Series:");
        int  diff=sc.nextInt();
        int sum=1;
        System.out.print(sum+"  ");
        int total=sum;
        for(int i=1;i<items;i++){
            sum+=diff;
            total+=sum;
            System.out.print(sum+"  ");
        }
        System.out.println("="+total);
    }
}