import  java.util.*;
public class fibonacci {
    public static void main(String arg[]){
        int a,b,s,n,counter=0;
        a=0;
        b=1;
        System.out.println("enter the limit: ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        while(counter<=n){
            System.out.print(a+"\t");
            s=a+b;
            a=b;
            b=s;
            counter++;
        }
    }
}
