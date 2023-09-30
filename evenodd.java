import java.util.*;
public class evenodd {
    public static void main(String arg[])
    {
        int a;
        System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if (a%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }
}
