import java.io.IOException;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            int h_1 = scan.nextInt();
            int m_1 = scan.nextInt();
            int h_2 = scan.nextInt();
            int m_2 = scan.nextInt();

            while (h_1 != 0 || h_2 != 0 || m_1 != 0 || m_2 != 0){
                int count_hours = 0, temp = h_1, minutes_result;
                if (h_1 == h_2 && m_1 < m_2){
                    minutes_result = m_2-m_1;
                }
                else{
                    if (temp != 23)
                        temp++;
                    else
                        temp = 0;
                    count_hours++;
                    while(temp != h_2) {
                        if (temp == 23)
                            temp = 0;
                        else 
                            temp++;
                        count_hours++;
                    }
                    minutes_result = count_hours*60-m_1+m_2;
                }
                System.out.format("%d%n",minutes_result);
                h_1 = scan.nextInt();
                m_1 = scan.nextInt();
                h_2 = scan.nextInt();
                m_2 = scan.nextInt();
            }
        }
    }    
}
