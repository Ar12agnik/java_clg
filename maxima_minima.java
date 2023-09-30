import java.util.*;
public class maxima_minima {
    public static void main(String arg[]){
        int a[]=new int[5];
        int max,min,i;
        System.out.println("enter 5 len array");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        min=a[0];
        max=a[0];
        for(i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println("the minimum element is "+min+"\n the maximum element is "+max);
    }
}
