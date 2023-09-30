import java.util.*;
public class sum_of_digit_using_while_loop {
    public static void main(String args[]){
        int i=0,sum=0,n,r;
        System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
