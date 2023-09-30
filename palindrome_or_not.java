import java.util.*;
public class palindrome_or_not {
    public static void main(String args[]){
        int i=0,sum=0,n,r,q;
        System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        q=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (sum==q){
            System.out.println("palindeome");
        }
        else{
            System.out.println("not a palindeome");
        }
    }
}
