import java.util.Scanner;

// public class DiamondPattern {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number :");
//       int num = sc.nextInt();
//       for(int i=0;i<num;i++){
//         for(int k=0;k<num-i-1;k++){
//             System.out.print("  ");
//         }
//         for(int j=0;j<i+i+1;j++){
//             System.out.print(j+1+" ");
//         }
//         System.out.println("");
//       }

//       //second loop
//       for(int i=0;i<num;i++){
//         for(int k=0;k<=i;k++){
//             System.out.print("  ");
//         }
//         for(int j=0;j<((num-i-1)*2)-1;j++){
//             System.out.print(j+1+" ");
//         }
//         System.out.println("");
//       }
//     }
// }


// output:-Enter the number :5
//         1 
//       1 2 3 
//     1 2 3 4 5 
//   1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 8 9 
//   1 2 3 4 5 6 7 
//     1 2 3 4 5 
//       1 2 3 
//         1 



// same problem another approach 

public class DiamondPattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number :");
      int num = sc.nextInt();
      for(int i=0;i<(num*2)-1;i++){
        if(i<num){
        for(int k=0;k<num-i-1;k++){
            System.out.print("  ");
        }
    }else{
        for(int k=0;k< (i-num)+1;k++){
            System.out.print("  ");
        }
    }

        if(i<num){
        for(int j=0;j<i+i+1;j++){
            System.out.print(j+1+" ");
        }
      }
      //
        else{
        for(int j=0;j<((((num*2)-i)*2)-1)-2;j++){
            System.out.print(j+1+" ");
        } 
      }
        System.out.println("");
      }
    }
}

