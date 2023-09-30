import java.util.*;
public class sum_of_digit_sing_for {
    public static void main(String arg[]){
        int i=0,sum=0,n,r;
        System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;n>0;i++){
            r=n%10;
            sum=sum+r;
            n=n/10;

        }
        System.out.println(sum);
    }
}
