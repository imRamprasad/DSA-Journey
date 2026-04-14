import java.util.Scanner;
public class SumofEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int i=1;
        int count=0;
        int j=1;
        while(i<=a){
            if(j%2==0){
                count+=j;
                i++;
                
            }
            j++;
        }
        System.out.println(count);
    }
}
