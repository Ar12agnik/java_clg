import java.util.*;
class SampleStaticMethods {
    static void AreaOfSquare(int x) {

        System.out.println("Area of Square= " + x * x);
    }
    public static void main(String args[]) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        x = sc.nextInt();
        SampleStaticMethods.AreaOfSquare(x);
    }
}