
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args){
        String s = "anagram",t = "nagaram" ;
        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s,String t){
        HashMap <Character,Integer> hm=new HashMap<>();
        int sLen=s.length();
        int tLen=t.length();
        if(sLen!=tLen){
            return false;
        }
        for(int i=0;i<sLen;i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<tLen;i++){
            if(hm.containsKey(t.charAt(i))){
                hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
            }else{
                hm.put(t.charAt(i),1);
            }
        }
        boolean flag=false;
        for(int val :hm.values()){
            if(val==0){
                flag=true;
            }else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}
