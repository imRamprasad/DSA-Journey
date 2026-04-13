import java.util.Scanner;
public class VowelorConsonant {
    public static void main(String[] args) {
        System.out.print("Enter the Character :");
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        a=Character.toLowerCase(a);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ){
            System.out.println(a+" is Vowel");
        }else{
            System.out.println(a+" is Consonant");
        }
    }
}