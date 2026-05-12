
public class print1ton {
    public static void main(String[] args){
       int n=10;
       num(n); 
    }
    public static void num(int n){
        if(n<=0){
            return;
        }
        num(n-1);
         System.out.print(n+" ");
    }
}
