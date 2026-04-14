import java.util.Scanner;

public class RangeMultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the range of multiplication table:");
        int range=sc.nextInt();
        for(int i=1;i<=range;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print(",");
            }
            System.out.println("");
        }
    }
}
