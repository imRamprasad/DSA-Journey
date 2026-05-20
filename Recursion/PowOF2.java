public class PowOF2 {
    public static void main(String[] args) {
        System.out.println(powOf2(5));

    }
    public static int powOf2(int i){
        if(i<=0){
            return 1;
        }
        int leftValue=powOf2(i/2);
        int rightValue=powOf2(i/2);
        if(i%2==0) return leftValue*rightValue;
        return leftValue*rightValue*2;
        
        
    }
}
