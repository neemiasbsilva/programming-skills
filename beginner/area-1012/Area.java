import java.io.IOException;
import java.util.Scanner;

public class Area {
    public static final double pi = 3.14159;
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            double A = scan.nextDouble();
            double B = scan.nextDouble();
            double C = scan.nextDouble();

            // Area of rectangled triangle = 1/2 Base (A) * Heigh(C)
            double rectangled_triangle = 1/2.0 * A * C;
            // Area of circle = pi * r^2 r = Radius (C)
            double circle = pi * Math.pow(C, 2);
            // Area of trapezium =  1/2 (Base_1 (A) + Base_2 (B)) * vertical height (C)
            double trapezium = 1.0/2.0 * (A + B) * C;
            // Area of square = side(B)^2
            double square = Math.pow(B, 2);
            // Area of rectangle = length(A) * width(B)
            double rectangled = A * B;

            System.out.format("TRIANGULO: %.3f%n", rectangled_triangle);
            System.out.format("CIRCULO: %.3f%n", circle);
            System.out.format("TRAPEZIO: %.3f%n", trapezium);
            System.out.format("QUADRADO: %.3f%n", square);
            System.out.format("RETANGULO: %.3f%n", rectangled);
        }
    }    
}
