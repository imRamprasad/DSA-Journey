import java.util.*;
public class FindValue{
    public static void main(String[] args){
        String s="BANANA";
        System.out.println(findValue(s,0,'A'));
    }
    public static List<Integer> findValue(String s,int i,char a){
        ArrayList<Integer> al=new ArrayList<>();
        if(i==s.length()){
            return al;
        }
        List<Integer> all=findValue(s,i+1,a);
        if(s.charAt(i)==a){
            al.add(i);
        }
        al.addAll(all);
        return al;
    }

};