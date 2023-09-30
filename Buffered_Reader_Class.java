import java.io.*;
class Buffered_Reader_Class
{
    public static void main(String args[])throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter Your Name: ");
        String name=br.readLine();
        System.out.println("Welcome "+name);
    }
}