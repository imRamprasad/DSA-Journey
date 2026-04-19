import java.util.Scanner;
//first approach
// public class HourglassPattern {
//     public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number :");
//       int num = sc.nextInt();
//       for(int i=0;i<num;i++){

//         for(int k=0;k<i;k++){
//             System.out.print("  ");
//         }
//         for(int j=0;j<((num-i)*2)-1;j++){
//             System.out.print(j+1+" ");
//         }
//         System.out.println("");
//       }

//       //second loop

//     for(int i=0;i<num-1;i++){

//         for(int k=0;k<(num-i-1)-1;k++){
//             System.out.print("  ");
//         }
//         for(int j=0;j<=((i+1)*2);j++){
//             System.out.print(j+1+" ");
//         }
//         System.out.println("");
//     }
//     }
// }

// output:-Enter the number :5
// 1 2 3 4 5 6 7 8 9 
//   1 2 3 4 5 6 7 
//     1 2 3 4 5 
//       1 2 3 
//         1 
//       1 2 3 
//     1 2 3 4 5 
//   1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 8 9




//second approach

public class HourglassPattern {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number :");
      int num = sc.nextInt();
      for(int i=0;i<(num*2)-1;i++){
        if(i<num){
        for(int k=0;k<i;k++){
            System.out.print("  ");
        }
        }else{
        for(int k=0;k<(num-(i-num))-2;k++){
            System.out.print("  ");
        }
        }
        if(i<num){
        for(int j=0;j<((num-i)*2)-1;j++){
            System.out.print(j+1+" ");
        }
        }else{
        for(int j=0;j<((i-num+1)*2)+1;j++){
            System.out.print(j+1+" ");
        }
        }
        System.out.println("");
      }

    }
}
