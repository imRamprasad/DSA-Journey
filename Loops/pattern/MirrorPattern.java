import java.util.Scanner;
public class MirrorPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rows=num*2-1;
        for(int i=0;i<rows;i++){
            if(i<num){
                for(int j=0;j<i+1;j++){
                    if(i==num-1 && j==i){
                        break;
                    }
                System.out.print(j+1+" ");
            }
            for(int k=0;k<(rows-(i+1*2))-i;k++){
                System.out.print(i+1+" ");
            }

            for(int j=0;j<i+1;j++){
                System.out.print(i-j+1+" ");
            }
            }else{
                // int val=i-num;
            for(int j=0;j<num-(i-num)-1;j++){
                System.out.print(j+1+" ");
            }
            int val=(i-num)*2+1;
            for(int k=0;k<val;k++){
                System.out.print(num-(i-num)-1+" ");
            }

            for(int j=0;j<num-(i-num)-1;j++){
                System.out.print(((num-(i-num))-j)-1+" ");
            }

            }
            System.out.println("  ");
        }

    }
}
