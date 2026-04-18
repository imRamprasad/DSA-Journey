import java.util.Scanner;
public class PyramidPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int k=0;k<num-i;k++){
                System.out.print("_ ");
            }
            for(int j=0;j<=i+i;j++){
                System.out.print(j+1+" ");
            }
            // for(int k=0;k<num-i;k++){
            //     System.out.print("  ");
            // }

            System.out.println("");
            
        }

    }
}