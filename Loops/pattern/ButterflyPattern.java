import java.util.Scanner;
//first approach
// public class ButterflyPattern {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int num=sc.nextInt();
//         for(int i=0;i<num-1;i++){
             

//             for(int j=0;j<i+1;j++ ){

//                     System.out.print("* ");
//             }

//             for(int k=0;k<(((num*2)-1)-(i+1*2))-i;k++){
//                 System.out.print("  ");
//             }
//             for(int j=0;j<i+1;j++ ){

//                     System.out.print("* ");
//             }
//             System.out.println("");
//         }

//         for(int i=0;i<1;i++){
//             for(int j=0;j<(num*2)-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }

//         for(int i=0;i<num-1;i++){
//             for(int j=0;j<(num-1)-i;j++){
//             System.out.print("* ");
//             }
//             for(int k=0;k<(i*2+1);k++){
//                 System.out.print("  ");
//             }
//             for(int j=0;j<((num-1)-i);j++){
//             System.out.print("* ");
//             }
//             System.out.println("");
//         }

//     }
// }


// output:-Enter the number :5
// *               * 
// * *           * * 
// * * *       * * * 
// * * * *   * * * * 
// * * * * * * * * * 
// * * * *   * * * * 
// * * *       * * * 
// * *           * * 
// *               * 



//Second approach
public class ButterflyPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        for(int i=0;i<(num*2)-1;i++){
            if(i<num){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            for(int k=0;k<(((num*2)-1)-(i+1*2))-i;k++){
                System.out.print("  ");
            }

            for(int j=0;j<i+1;j++){
                if(i==num-1 && j==i){
                    break;
                }
                System.out.print("* ");
            }
            }else{
            for(int j=0;j<num-1-(i-num);j++){
                System.out.print("* ");
            }
            for(int k=0;k<(i-num)*2+1;k++){
                System.out.print("  ");
            }
            for(int j=0;j<num-1-(i-num);j++){
                System.out.print("* ");
            }
            }
            System.out.println("");
        }
    }

        
}