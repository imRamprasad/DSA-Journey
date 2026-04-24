import java.util.Scanner;
public class GrowingPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            int k=1;
            int l=1;
            int v=l+k;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(i==0 || i==1){
                System.out.print(i+" ");
                }else{
                    System.out.print(v+" ");
                    k=l;
                    l=v;
                    v=l+k;
                }
            }
            System.out.println();
        }
    }
}


// output:-5
// 0 
// 1 1 
// 2 3 5 
// 8 13 21 34 
// 55 89 144 233 377 