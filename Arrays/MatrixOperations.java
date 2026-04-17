// import java.util.Scanner;
public class MatrixOperations {
    public static void main(String[] args){
        int a[][]={{1,2},{3,4}};
        int b[][]={{1,2},{3,4}};
        int add[][]=new int[a.length][a[0].length];
        int sub[][]=new int[a.length][a[0].length];
        int mul[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                add[i][j]=a[i][j]+b[i][j];
                sub[i][j]=a[i][j]-b[i][j];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Addition:");
        for(int val[]:add){
            for(int var:val){
                System.out.print(var+" ");
            }
            System.out.println();
        }
        System.out.println("Subtraction:");
        for(int val[]:sub){
            for(int var:val){
                System.out.print(var+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplcation:");
        for(int val[]:mul){
            for(int var:val){
                System.out.print(var+" ");
            }
            System.out.println();
        }
    }
}
