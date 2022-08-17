import java.io.IOException;
import java.util.Scanner;


public class FlaviousJosepheLegends {
    /**
     * @param n
     * @param k
     * @return last_remainder
     */
    static int josephus(int n, int k){
        // if (n == 1) return 1;
        // return (josephus(n-1, k) + k - 1) % n + 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }
        return result+1;
    }
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            int nc = scan.nextInt();
            for (int i=0; i < nc; i++){
                int n = scan.nextInt();
                int k = scan.nextInt();
                int josephus_result = josephus(n, k);
                
                System.out.format("Case %d: %d%n", i+1, josephus_result);

            }
        }
    }
}
