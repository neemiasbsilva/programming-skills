import java.io.IOException;
import java.util.Scanner;

public class Greatest {
    private static int max_ab(int a, int b){
        int result = (a+ b +(Integer) Math.abs(a-b)) / 2;
        return result;
    }
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int result = max_ab(max_ab(a, b), c);

            System.out.format("%d eh o maior%n", result);
        }
    }
}
