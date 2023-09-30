class c1{
    int a=10;
}
class c2 extends c1{
    int b=20;

}
public class multiple_inheritance extends c2 {
    public static void main(String args[]){
        multiple_inheritance m= new multiple_inheritance();
        System.out.println(m.a);
        System.out.println(m.b);
    }
}
