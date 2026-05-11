import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fizzBuzz(num));
        
    }
// normal way to solve the problem
    public static List<String> fizzBuzz(int n) {
         List<String> li=new ArrayList<>();
        for(int i=1;i<=n;i++){
        if(i%5==0 && i%3==0){
            li.add("FizzBuzz");
        }else if(i%3==0){
            li.add("Fizz");
        }else if(i%5==0){
            li.add("Buzz");
        }else{
            li.add(String.valueOf(i));
        }
        }
        return li;
    }


}