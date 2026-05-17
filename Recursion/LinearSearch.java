public class LinearSearch {
    public static void main(){
        int [] arr={1,2,3,4,1};
        System.out.println(lSerch(arr,5,0));
    }

    public static int lSerch(int[] arr,int tar,int i){
        if(arr.length==i){
            return -1;
        }else if(arr[i]==tar){
            return tar;
        }
        return lSerch(arr,tar,i+1);

    }

}
