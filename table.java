import java.util.*;
public class table {
    public static void main(String args[]){
        int a,n,i;
        System.out.println("enter the table nubmer");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=0;i<=12;i++){
            n=a*i;
            System.out.println(a+"*"+i+"="+n);
        }

    }

}
