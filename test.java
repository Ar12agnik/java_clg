import mypackage.*;
import Sum_of_two.SOT;
public class test {
    public static void main(String args[]){
        package_in_java p= new package_in_java();
        p.hello();
        SOT s= new SOT();
        System.out.println(s.Sum(12,13));

    }
}
