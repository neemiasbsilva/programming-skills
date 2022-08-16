
import java.io.IOException;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            int number = scan.nextInt();
            int hours = scan.nextInt();
            float amount = scan.nextFloat();
            float salary = amount*hours;
            System.out.format("NUMBER = %d%n", number);
            System.out.format("SALARY = U$ %.2f%n", salary);
        }
    }
}
