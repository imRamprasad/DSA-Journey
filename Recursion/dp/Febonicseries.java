import java.util.*;
public class Febonicseries{
    public static void main(String args[]){
        System.out.println(feboinc(100));
    }
        public static HashMap<Integer,Long> hm=new HashMap<>();
    public static long feboinc(int n){

        if(n<=1){
            return n;
        }

        if(hm.containsKey(n)){
            return hm.get(n);
        }
        long ans=feboinc(n-2)+feboinc(n-1);
        hm.put(n,ans);
        return ans;


    }
}