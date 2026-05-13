
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args){
        String s = "anagram",t = "nagaram" ;
        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s,String t){
        // HashMap <Character,Integer> hm=new HashMap<>();
        int arr[] =new int[24];
        int sLen=s.length();
        int tLen=t.length();
        if(sLen!=tLen){
            return false;
        }
        for(int i=0;i<sLen;i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        boolean flag=false;
        for(int val :arr){
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
