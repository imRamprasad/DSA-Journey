
import java.util.HashSet;
import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,3};
        int k=3;
        System.out.println(containsNearbyDuplicate(arr,k) );
        
    }

        public static boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap <Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(hm.containsKey(nums[i])){
                    return true;
                }
                hm.put(nums[i],i);
                // System.out.println(hm);
                if(hm.size()>k){
                    hm.remove(nums[i-k]);
                    // System.out.println("         "+hm);
                }
            }
            return false;
        
         }
}
