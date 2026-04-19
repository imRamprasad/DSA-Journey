import java.util.Scanner;

public class HollowPyramid {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int k=0;k<num-i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<(i*2)+1;j++){
                if(i==0 || i==num-1 || j==0 || j==(i*2)){
                System.out.print(j+1+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


// output:-Enter the number :5
//           1 
//         1   3 
//       1       5 
//     1           7 
//   1 2 3 4 5 6 7 8 9 