import java.io.IOException;
import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double w_a = 3.5, w_b = 7.5;
            double average = (a*w_a + b*w_b)/ (w_a + w_b);
            System.out.format("MEDIA = %.5f%n", average);
        }
    }
    
}
