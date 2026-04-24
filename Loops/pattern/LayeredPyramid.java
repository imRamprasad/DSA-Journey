import java.util.Scanner;
public class LayeredPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(i+1+" ");
            }
                System.out.println();
        }
    }
}



// output:-5
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 