import java.util.Scanner;
public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==0 || j==num-1 || i==num-1 || j==0){
                    System.out.print(j+1+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}


// output:-Enter the number :5
// 1 2 3 4 5 
// 1       5 
// 1       5 
// 1       5 
// 1 2 3 4 5