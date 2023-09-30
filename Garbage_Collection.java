class Garbage_Collection
{
    public void finalize() {
        System.out.println("The items have been collected");
    }
    public static void main(String args[])
    {
        Garbage_Collection s1=new Garbage_Collection();
        Garbage_Collection s2=new Garbage_Collection();
        s1=null;
        s2=null;
        System.gc();
    }
}