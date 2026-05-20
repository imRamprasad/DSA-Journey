public class FindMax {
    public static void main(String[] args){
        int[] arr={2,3,5,1,3,5,1};
        int max=findValue(arr,0,arr.length-1);

        System.out.println(max);
    }
    public static int findValue(int[] arr,int start ,int end ){
        if(start==end){
            return arr[start];
        }
        int mid=start+(end-start)/2;
        int leftValue=findValue(arr,start,mid);
        int rightValue=findValue(arr,mid+1,end);
        if(leftValue>rightValue){
            return leftValue;
        }else{
            return rightValue;
        }
    }
}
