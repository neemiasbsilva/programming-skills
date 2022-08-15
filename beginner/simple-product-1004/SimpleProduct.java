import java.io.IOException;
import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            int x_1 = scan.nextInt();
            int x_2 = scan.nextInt();
            int prod = x_1 * x_2;
            System.out.format("PROD = %d%n",prod);
        }
    }
}
