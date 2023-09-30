import java.util.*;
public class palindrome_or_not_do {
    public static void main(String args[]){
        int i=0,sum=0,n,r,q;
        System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        q=n;
        do{
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }while (n>0);
        if (sum==q){
            System.out.println("palindeome");
        }
        else{
            System.out.println("not a palindeome");
        }
    }
}
