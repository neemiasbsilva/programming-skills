import java.io.IOException;
import java.util.Scanner;

public class Queen{
   
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            int x_1 = scan.nextInt();
            int y_1 = scan.nextInt();
            int x_2 = scan.nextInt();
            int y_2 = scan.nextInt();
            while(x_1 != 0){
                // first case: same position
                if (x_1 == x_2 && y_1 == y_2) 
                    System.out.format("0%n");
                else if(x_1 == x_2 || y_1 == y_2 || Math.abs(x_1 - x_2) == Math.abs(y_1-y_2)) // same row or column or diagonal
                    System.out.format("1%n");
                else 
                    System.out.format("2%n");
                x_1 = scan.nextInt();
                y_1 = scan.nextInt();
                x_2 = scan.nextInt();
                y_2 = scan.nextInt();
            }
        }
    }
}
