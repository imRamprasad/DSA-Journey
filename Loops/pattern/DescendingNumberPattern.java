import java.util.Scanner;

public class DescendingNumberPattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number :");
      int num = sc.nextInt();
      for(int i=0;i<num;i++){
        for(int k=0;k<i;k++){
            System.out.print("  ");
        }
        for(int j=0;j<num-i;j++){
            System.out.print(j+1+" ");
        }
        System.out.println("");
      }

    }
}


// output:-Enter the number :5
// 1 2 3 4 5 
//   1 2 3 4 
//     1 2 3 
//       1 2 
//         1

