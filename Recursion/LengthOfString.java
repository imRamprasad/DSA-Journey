public class LengthOfString {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(len(s));
    }
    public static int len(String s){
        try{
            return 1+len(s.substring(2));

        }catch(Exception e){
            return 0;
        }
    }
}
