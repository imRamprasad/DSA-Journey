import java.util.Scanner;
public class StepstoReducetoZero {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num){
        int count=0;
        while(num>0){
            if(num%2==0){
                num/=2;
                count++;
            }else{
                num-=1;
                count++;
            }
        }
        return count;

    }
}
