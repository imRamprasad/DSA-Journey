import java.util.Scanner;
public class PyramidPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int k=0;k<num-i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<=i+i;j++){
                System.out.print(j+1+" ");
            }

            System.out.println("");
            
        }

    }
}

// output:-
//           1 
//         1 2 3 
//       1 2 3 4 5 
//     1 2 3 4 5 6 7 
//   1 2 3 4 5 6 7 8 9