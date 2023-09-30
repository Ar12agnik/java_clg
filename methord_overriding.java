import java.util.*;
class a{
    void abc(int a){
        System.out.println(a);
    }
}
class b{
    void abc(int a){
        System.out.println(a+10);
    }
}
public class methord_overriding {

    public static void main(String arg[]){
        a c=new a();
        b w= new b();
        c.abc(1);
        w.abc(1);

    }
}
