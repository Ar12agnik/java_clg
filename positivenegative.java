import java.util.Scanner;

public class positivenegative {
    public static void main(String arg[]){
            int a;
            System.out.println("enter a number: ");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            if (a>0){
                System.out.println("positive number");
            }
            else{
                System.out.println("negative number");
            }

        }
    }


