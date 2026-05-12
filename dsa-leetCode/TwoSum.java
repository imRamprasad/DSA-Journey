import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args){
        int[] arr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    public static int[] twoSum(int[] num,int target){
        int[] val=new int[2];
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    val[0]=i;
                    val[1]=j;
                }
            }
        }
        return val;
    }
}
