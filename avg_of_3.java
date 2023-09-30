import java.util.*;
public class avg_of_3 {
    public static void main(String args[]){
        int a,b,c,avg;
        System.out.println("enter a,b,c values: ");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avg=(a+b+c)/3;
        System.out.println("avarage of 3 numbers is "+avg);

    }
}
