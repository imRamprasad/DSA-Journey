import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums){
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                product*=nums[j];

            }
            arr[i]=product;
        }
        return arr;
    }
}
