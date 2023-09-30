import java.util.Scanner;

class Stupersonal{
    String sname,rno;
    int s1,s2;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Snamme,rno,s1,s2 ");
        rno=sc.next();
        sname=sc.next();
        s1=sc.nextInt();
        s2=sc.nextInt();
        }
}
public class Single_inheritance extends Stupersonal {
    int tot,avg;
    void calc(){
        tot=s1+s2;
        avg=tot/2;
        System.out.println("total="+tot);
        System.out.println("Avg="+avg);
    }
    public static void main(String args[]){
        Single_inheritance s= new Single_inheritance();
        s.getdata();
        s.calc();
    }
}
