import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        double sum=0;
        for(int i=1;i<=a;i++){
            sum+=1/(double)i;
        }
        System.out.println(sum);


    }
}
