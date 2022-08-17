import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Long;

public class CarryNotCarry {
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            while (scan.hasNextLong()){
                long a = scan.nextLong();
                long b = scan.nextLong();
                String a_binary = Long.toBinaryString(a);
                String b_binary = Long.toBinaryString(b);
                String xor_result = "";

                if (a_binary.length() != b_binary.length()){
                    int difference = Math.abs(a_binary.length()-b_binary.length());
                    if (a_binary.length() > b_binary.length()){
                        b_binary = "0".repeat(difference) + b_binary;
                    }
                    else{
                        a_binary = "0".repeat(difference) + a_binary;
                    }
                }
                for (int i=0; i < a_binary.length(); i++){
                    if (a_binary.charAt(i) != b_binary.charAt(i)){
                        xor_result += "1";
                    }
                    else {
                        xor_result += "0";
                    }
                }
                
                long result = Long.parseLong(xor_result,2);

                System.out.format("%d%n", result);
            }
        }
    }
}
