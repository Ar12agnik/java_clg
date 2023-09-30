import java.util.*;

public class vaoul {

    public static void main(String arg[]) {
        char a;
        System.out.println("enter a char: ");
        Scanner sc = new Scanner(System.in);
        a = sc.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("vouel ");
        } else {
            System.out.println("not a vouel");
        }
    }
}
