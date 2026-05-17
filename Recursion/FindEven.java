import java.util.*;
public class FindEven {
    public static void main(String[] args) {
        int[] arr={1,2,6,7,8};
        System.out.println(findEven(arr,0));
    }
    public static List<Integer> findEven(int[] arr,int i){
        List<Integer> al=new ArrayList<>();
        if(i==arr.length){
            return al;
        }
        List<Integer> all= findEven(arr,i+1);
        al.addAll(all);
        if(arr[i]%2==0){
            al.add(i);
        }
        return al;

    }
}

