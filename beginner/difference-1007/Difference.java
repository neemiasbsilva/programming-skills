import java.io.IOException;
import java.util.Scanner;

public class Difference {
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();

            int dif = a*b - c*d;
            System.out.format("DIFERENCA = %d%n",dif);
        }
    }
}
