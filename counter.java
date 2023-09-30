import org.w3c.dom.css.Counter;

public class counter {
    static  int count = 5;
    counter(){
        count++;
    }
    public static void main(String arg[]){
        counter c1 = new counter();
        System.out.println("c1 "+c1.count);
        counter c2 = new counter();
        System.out.println("c2 "+c2.count);
        counter c3 = new counter();
        System.out.println("c3 "+c3.count);
    }
}
