import java.util.ArrayList;

public class MinMaxinArray {
    public static void main(String[] args){
        int[] a={1, 4, 3, 5, 8, 6};
        System.out.println(getMinMax(a,0));

    }
     public static ArrayList<Integer> getMinMax(int[] arr,int i) {
        ArrayList <Integer> al=new ArrayList<>();

        if(arr.length-1 ==i){
            al.add(arr[arr.length-1]);
            al.add(arr[arr.length-1]);
            return al;
        }
        ArrayList<Integer> all= getMinMax(arr,i+1);
        al.addAll(all);
        if(arr[i]<al.get(0)){
            al.set(0,arr[i]);
        }
        if(arr[i]>al.get(1)){
            al.set(1,arr[i]);
        }
        return al;
    }
}
