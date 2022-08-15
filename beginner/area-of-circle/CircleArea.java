import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class CircleArea {
    public static void main(String [] args) throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            // A = π . R2. Considering to this problem that π = 3.14159:
            double pi = 3.14159;
            double r = scan.nextDouble();
            double A = pi * Math.pow(r, 2);
            System.out.format("A=%.4f%n",A);
        }
    }
}
