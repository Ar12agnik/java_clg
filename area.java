import java.util.*;
public class area {
    int l,b,r;
    public static void main(String arg[]){
        area a=new area();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the legnth and bredth: ");
        a.l= sc.nextInt();
        a.b=sc.nextInt();
        System.out.println("the area is "+(a.l*a.b));
        System.out.println("enter the radius: ");
        a.r= sc.nextInt();
        System.out.println("the area is "+(3.14*a.r*a.r));
    }
}
