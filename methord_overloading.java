import  java.util.*;
public class methord_overloading {
    void area(int a){
        System.out.println("area of square is "+a*a);
    }
    void area(int a,int b){
        System.out.println("area of rectangle is "+(a*b));
    }
    public static void main(String arg[]){
        methord_overloading s= new methord_overloading();
        s.area(12);
        s.area(2,3);
    }
}
