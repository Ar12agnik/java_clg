import java.util.*;
public class area_rect_sq {
    int l,b,side;
    public static void main(String arg[]){
        area_rect_sq a=new area_rect_sq();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the legnth and bredth: ");
        a.l= sc.nextInt();
        a.b=sc.nextInt();
        System.out.println("the area is "+(a.l*a.b));
        System.out.println("enter the side: ");
        a.side= sc.nextInt();
        System.out.println("the area is "+(a.side*a.side));
    }
}

