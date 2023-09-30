abstract  class bank {
    abstract int getRateofIntrest();
}
class SBI extends bank{
    @Override
    int getRateofIntrest() {
        return 7;
    }
}
class Axis extends bank{
    @Override
    int getRateofIntrest() {
        return 8;
    }
}
public class test_bank {
    public static void main(String arg[]){
        bank b;
        b=new SBI();
        System.out.println("Rate of intrest is = "+ b.getRateofIntrest());
        b= new Axis();
        System.out.println("Rate of Intrest is = "+b.getRateofIntrest());
    }
}
