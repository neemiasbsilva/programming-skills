import java.io.IOException;
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            double x_1 = scan.nextDouble();
            double x_2 = scan.nextDouble();
            double x_3 = scan.nextDouble();
            int w_1 = 2, w_2 = 3, w_3 = 5;
            double average = (x_1 * w_1 + x_2 * w_2 + x_3 * w_3) / (w_1+w_2+w_3);
            System.out.format("MEDIA = %.1f%n",average);
        }
    }
    
}
