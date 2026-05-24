import java.util.ArrayList;

public class RemoveA{
    public static void main(String[] args){

        String s="abc";
        System.out.println(sSubString("",s));
        

        // StringBuilder sb=removeA(s);
        // System.out.println(sb.toString());
    }
    // public static StringBuilder removeA(String s){
    //     if(s.isEmpty()){
    //         return new StringBuilder();
    //     }
    //     StringBuilder sb = removeA(s.substring(1));
    //     if (s.startsWith("yayt")) {
    //         return removeA(s.substring(4));
    //     }else{
    //         sb.append(s.charAt(0));
    //     }
    //     return sb;

    // }



    public static ArrayList<String> sSubString(String s ,String sh){
        ArrayList<String> base = new ArrayList<>();
        if(sh.isEmpty()){
        base.add(s+"12"); // Add the completed substring to our list
        return base;
        } 

        ArrayList<String> al=sSubString(s+sh.charAt(0),sh.substring(1));
        ArrayList<String> a2=sSubString(s,sh.substring(1));
        al.addAll(a2);
        return al;
    }
}