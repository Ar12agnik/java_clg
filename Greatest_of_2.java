import java.util.*;
public class Greatest_of_2 {
    public static void main(String arg[]){
        int a,b;
        System.out.println("enter a b values: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if (a>b){
            System.out.println(a+" is greater");

        }
        else{
            System.out.println(b+" is greatest");
        }
    }
}
