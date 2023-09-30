import java.util.*;
public class options {
    public static void main(String args){
        int a,b,c,ch;
        System.out.println("enter a,b values: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("1)Addition\n2)subtraction\n3)multiplication\n4)division\n5)mod\nEnter your choice");
        ch= sc.nextInt();
        switch (ch){
            case 1:
                c=a+b;
                System.out.println("sum is "+c);
                break;
            case 2:
                c=a-b;
                System.out.println("difference is "+c);
                break;
            case 3:
                c=a*b;
                System.out.println("product is "+c);
                break;
            case 4:
                c=a/b;
                System.out.println("Division is "+c);
                break;
            case 5:
                c=a%b;
                System.out.println("modulous is "+c);
                break;
            default:
                System.out.println("invalid choice!!");
        }


    }
}
