public class ProductofNonZero {
    public static void main(String[] args){
        int a=120120;
        System.out.println(productOfNonZero(a));
    }
    public static int productOfNonZero(int a){
        if(a<9){
            return a;
        }
        return (((a%10!=0)?(a%10):1) *productOfNonZero(a/10));

        
    }
}
