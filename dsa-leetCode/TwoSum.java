import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args){
        int[] arr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    public static int[] twoSum(int[] num,int target){
        HashMap <Integer,Integer >hm=new HashMap<>();
        for(int i=0;i<num.length;i++){
            int val=target-num[i];
            if(!hm.containsKey(val)){
                hm.put(num[i],i);
            }else{
                return new int[]{hm.get(val),i};
            }
        }
        return new int[]{};
    }
}
