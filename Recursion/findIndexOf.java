import java.util.*;
public class findIndexOf {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4};
        System.out.println(allindex(arr,0,4));
    }
    public static List<Integer> allindex(int[] arr,int i,int tar){
        List<Integer> al=new ArrayList<>();
        if(i==arr.length){
            return al;
        }
        List<Integer> all= allindex(arr,i+1,tar);
        al.addAll(all);
        if(arr[i]==tar){
            al.add(i);
        }
        return al;
    }
}
