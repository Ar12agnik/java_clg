class emp{
    int salary=10000;
}
public class Employee  extends  emp{
    int allowances=1000;
    public static void main(String arg[]){
        Employee e = new Employee();
        System.out.println("Salary="+e.salary);
        System.out.println("net Salary="+(e.allowances+e.salary));
    }
}
