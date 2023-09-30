import  java.util.*;
public class insert_at_pos {
    public static void main(String arg[]){
        int a[] =new int[7];
        int i,n=a.length;
        Scanner sc=new Scanner(System.in);
        for (i=0;i<n-1;i++){
            a[i]=sc.nextInt();}
        System.out.println("enter the position: ");
        int p=sc.nextInt();
        System.out.println("enter the element: ");
        int x= sc.nextInt();
        for (i =(n-1);i>=(p-1);i--){
            a[i]=a[i-1];
        }
        a[i+1]=x;
        System.out.println("after inserting: ");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
