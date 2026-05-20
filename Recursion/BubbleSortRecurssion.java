import java.util.Arrays;

public class BubbleSortRecurssion {
    public static void main(String[] args){
        int [] arr={4,3,6,15,1};
       bubbleSortRecurssion(arr,arr.length-1,0);
       System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSortRecurssion(int[] arr,int r,int c){
        if(r==0)return ;
        if(c<r){
            if(arr[c]<arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            System.out.print(arr[c]+ "->" +c +" ");

            bubbleSortRecurssion( arr,r,c+1);
            // if(arr[c]<arr[c+1]){
            //     int temp=arr[c];
            //      arr[c]=arr[c+1];
            //     arr[c+1]=temp;
            // }
            // System.out.println();
        }else{
            System.out.println();
            bubbleSortRecurssion( arr,r-1,0);
            // System.out.print(arr[c]+ "->" +c +" ");
        }
    }
}
