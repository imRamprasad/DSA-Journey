import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    // public static int[] productExceptSelf(int[] nums){
    //     int[] arr=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         int product=1;
    //         for(int j=0;j<nums.length;j++){
    //             if(i==j){
    //                 continue;
    //             }
    //             product*=nums[j];

    //         }
    //         arr[i]=product;
    //     }
    //     return arr;
    // }

    //second Approach

    public static int[] productExceptSelf(int[] nums){
        int[] ans=new int[nums.length];
        int[] prefix=new int[nums.length];
        int[] postfix=new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        postfix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            postfix[i]=postfix[i+1]*nums[i+1];
            
        }

        for(int i=0;i<nums.length;i++){
            ans[i]=postfix[i]*prefix[i];
        }
        System.out.println(Arrays.toString(prefix));

        System.out.println(Arrays.toString(postfix));

        return ans;
        }

}
