import java.io.IOException;
import java.util.Scanner;


public class BonusSalary {
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            String name = scan.nextLine();
            double salary = scan.nextDouble();
            double sold_value = scan.nextDouble();
            double bonus_salary = (sold_value*0.15)+salary;

            System.out.format("TOTAL = R$ %.2f%n",bonus_salary);
        }
    }
}
