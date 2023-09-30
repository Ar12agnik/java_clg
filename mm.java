import java.util.*;
public class mm {
    public static void main(String arg[]){
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j,k,ch;
        /*a array*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a matrix values: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }        System.out.println("enter the b matrix values: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\nTranspose\nEnter the element");
        ch=sc.nextInt();
        switch (ch){
            case 1:
            System.out.println("addition");
            for (i=0;i<3;i++){
                for(j=0;j<3;j++){
                    c[i][j]=a[i][j]+b[i][j];
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();

            }
            break;
            case 2:
                System.out.println("Sub");
                for (i=0;i<3;i++) {
                    for (j = 0; j < 3; j++) {
                        c[i][j] = a[i][j] - b[i][j];
                        System.out.print(c[i][j] + "\t");
                    }
                    System.out.println();

                }
                break;
            case 3:
                System.out.println("Multiplication");
                for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                        c[i][j]=0;
                        for(k=0;k<3;k++){
                            c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                        }
                        System.out.print(c[i][j] +"\t");
                    }
                    System.out.println();

                }
                break;
            case 4:
                System.out.println("transpose");
                for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                        c[i][j]=a[j][i];
                        System.out.print(c[i][j]+"\t");

                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("invalid");



        }
    }
}
