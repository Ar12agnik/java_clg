import java.util.Scanner;
/*constructor*/
public class Area_of_circle {
    Area_of_circle(){
        int r;
        double area;
        System.out.println("Enter value of r: ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=3.14*r*r;
        System.out.println("area of circle is "+area);


    }
    Area_of_circle(int l,int b){
        int area;
        area=l*b;
        System.out.println("Area of the rectangle is "+area);
    }
    public static void main(String arg[]){
        Area_of_circle a =new Area_of_circle();
        Area_of_circle b=new Area_of_circle(12,13);

    }
}
