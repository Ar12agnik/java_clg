import java.util.*;
class CLA
{
    public static void main(String arg[])
    {
        int a,b;
        a=Integer.parseInt(arg[0]);
        b=Integer.parseInt(arg[1]);
        if(a>b)
            System.out.println(a+" is Greatest");
        else
            System.out.println(b+" is Greatest");
    }
}