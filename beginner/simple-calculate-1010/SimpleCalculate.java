import java.io.IOException;
import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            int c_units_1 = scan.nextInt();
            int n_units_1 = scan.nextInt();
            float p_units_1 = scan.nextFloat();
            int c_units_2, n_units_2;
            float p_units_2;

            if (scan.hasNextInt()){
                c_units_2 = scan.nextInt();
                n_units_2 = scan.nextInt();
                p_units_2 = scan.nextFloat();
            }
            else {
                c_units_2 = c_units_1;
                n_units_2 = n_units_1;
                p_units_2 = p_units_1;
            }

            float result = p_units_1*n_units_1 + p_units_2 * n_units_2;

            System.out.format("VALOR A PAGAR: R$ %.2f%n", result);
        }
    }
}
