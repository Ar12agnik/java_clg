class Aoc {
    int r=5;
}
public class Super_keyword extends Aoc {
    int h=5;
    void calc(){
        System.out.println("AOC="+(3.14*super.r*super.r));
        System.out.println("AOCY="+(3.14*super.r*super.r*h));
    }
    public static void main(String arg[]){
        Super_keyword s= new Super_keyword();
        s.calc();
    }
    }

