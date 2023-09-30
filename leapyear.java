import java.util.Scanner;

public class leapyear {

    public static void main(String arg[]) {
        int a;
        System.out.println("enter a Year: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}
