public class BinarySearch {
    public static void main(String[] args){
        int[] arr={2,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,0,arr.length-1,1));
    }
    public static int binarySearch(int[] arr,int start,int end ,int val){
        int mid=start+(end-start)/2;
        if(val>arr[end] || val<arr[start]){
            return -1;
        }
        
        if(arr[mid]>val){
            return binarySearch(arr, start,mid-1, val);
        }else if(arr[mid]<val){
            return binarySearch(arr, mid+1,end, val);
        }else if(arr[mid]==val){
            return mid;
        }else{
            return -1;
        }

    }

}
