import java.io.IOException;
import java.util.Scanner;

public class ExtremelyBasic {
    public static void main(String[] args) throws IOException{
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = a+b;
            System.out.format("X = %d%n",x);
        }
    }
}