public class PowSet{
    public static void main(String[] args) {
        String s="abc";
        powSet(s,"-",0);
    }

    public static void powSet(String s,String curr,int i){
        if(s.length()==i){
            System.out.println(curr);
            return;
        }

        powSet(s,curr,i+1);
        powSet(s,curr+s.charAt(i),i+1);

    }
}
