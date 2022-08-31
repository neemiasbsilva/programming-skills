import java.io.IOException;
import java.util.Scanner;

public class Sphere {

    public static final double pi = 3.14159;
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            double radius = scan.nextDouble();
            double result = (double)((4/3.0) * pi * Math.pow(radius, 3));
            System.out.format("VOLUME = %.3f%n", result);
        }
    }
}
