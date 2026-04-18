import java.util.Scanner;

public class RightAlignedBlock {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number :");
      int num = sc.nextInt();
      for(int i=0;i<num;i++){
        for(int k=0;k<num-i-1;k++){
            System.out.print("  ");
        }
        for(int j=0;j<num;j++){
            System.out.print(j+1+" ");
        }
        System.out.println("");
      }
    }
}


// output:-Enter the number :5
//         1 2 3 4 5 
//       1 2 3 4 5 
//     1 2 3 4 5 
//   1 2 3 4 5 
// 1 2 3 4 5