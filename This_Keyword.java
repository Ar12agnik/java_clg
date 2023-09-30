import java.util.*;
public class This_Keyword
{
    int x,y;
    void initial(int x , int y)
    {
        this.x=x;
        this.y=y;
    }
    void dis()
    {
        if (x>y)
            System.out.println("x is big");
        else
            System.out.println("y is big");
    }
    public static void main(String arg[])
    {
        This_Keyword s=new This_Keyword();
        s.initial(8,5);
        s.dis();
    }
}