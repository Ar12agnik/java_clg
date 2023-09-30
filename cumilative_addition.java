import java.util.*;
public class cumilative_addition {
    public static void main(String arhg[]){
        int a,sum=0,counter=0;
        System.out.println("enter the limit: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        do{
            sum=sum+counter;
            counter++;
        }while (counter<=a);
        System.out.println(sum);
    }
}
