
import java.util.HashSet;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int [] arr={1,2,3,1};
        int k=3;
        System.out.println(containsNearbyDuplicate(arr,k) );
        
    }

        public static boolean containsNearbyDuplicate(int[] nums, int k) {
            HashSet <Integer> hs=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(hs.contains(nums[i])){
                    return true;
                }
                hs.add(nums[i]);
                if(hs.size()>k){
                    hs.remove(nums[i-k]);
                }

            }

            return false;
        
         }
}
