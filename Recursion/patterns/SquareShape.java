public class SquareShape {
    public static void main(String[] args) {
            squareShape(5,5);
        
    }
    public static void squareShape(int r,int c){
        if(r<=0){
            return ;
        }
        if(c>=r){
            System.out.print("*");
            squareShape(r,c-1);
        }
        else{
            c=5;
            System.out.println("");
            squareShape(r-1,c);
        }
    }

}
