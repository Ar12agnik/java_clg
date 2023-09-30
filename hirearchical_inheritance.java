/* A
   |
  - -
  |  |
  B   C  */
class A{
    A(){
        System.out.println("Class A");
    }
}
class B extends A{
    B(){
        super();//calls constructor of prev class
        System.out.println("Class B");
    }
}
public class hirearchical_inheritance extends A {
    hirearchical_inheritance(){
        super();//calls the constructor of prev class
        System.out.println("Calss C");
    }
    public static void main(String arg[]){
        B b= new B();
        hirearchical_inheritance c = new hirearchical_inheritance();

    }
}
