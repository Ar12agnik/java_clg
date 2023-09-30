import java.util.*;
public class factorial_of_number {
    public static void main(String arg[]){
        int i,n,f=1;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("factorial is "+f);
    }
}
