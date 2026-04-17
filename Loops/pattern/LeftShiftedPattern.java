import java.util.Scanner;

public class LeftShiftedPattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number :");
      int num = sc.nextInt();
      for(int i=0;i<num;i++){
        for(int k=1;k<num-i;k++){
            System.out.print("  ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println("");
      }
      
    }

}

// output:-
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 