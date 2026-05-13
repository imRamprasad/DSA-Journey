import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] s={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(s));

    }
    public static List<List<String>> groupAnagrams(String[] s){
        if(s.length==0){
            return new ArrayList<>();
        }
        Map <String,List<String>> hm=new HashMap<>();
        int[] count=new int[26];
        for(String str:s){
            Arrays.fill(count, 0);
            for(char Char:str.toCharArray()){
                count[Char-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            sb.append("#");
            for(int Char:count){
                sb.append(Char);
            }
            //  String key = sb.toString();
            if(!hm.containsKey(sb.toString())){
                hm.put(sb.toString(),new ArrayList<>());
            }
             hm.get(sb.toString()).add(str);
        }
        return new ArrayList<List<String>>(hm.values());

    }
}