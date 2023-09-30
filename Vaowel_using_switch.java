import java.util.*;
public class Vaowel_using_switch {
    public static void main(String args[]){
        char a;
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
        switch (a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vaowel");
                break;
            default:
                System.out.println("not a vouel");
                
        }

    }
}
