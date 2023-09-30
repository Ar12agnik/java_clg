import java.util.*;
class Passing_And_Returning_Objects {
    int a, b;
    Passing_And_Returning_Objects(int i, int j) {
        a = i;
        b = j;
    }
    boolean equals(Passing_And_Returning_Objects obj) {

        return this.a == obj.a && this.b == obj.b;
    }
}
 class CPg {
    public static void main(String[] args) {
        Passing_And_Returning_Objects ob1 = new Passing_And_Returning_Objects(100, 22);
        Passing_And_Returning_Objects ob2 = new Passing_And_Returning_Objects(100, 22);
        Passing_And_Returning_Objects ob3 = new Passing_And_Returning_Objects(-1, -1);
        // Use the .equals() method to compare objects for equality
        if (ob1.equals(ob2)) {
            System.out.println("ob1 is equal to ob2");
        } else {
            System.out.println("ob1 is not equal to ob2");
        }
    }
}