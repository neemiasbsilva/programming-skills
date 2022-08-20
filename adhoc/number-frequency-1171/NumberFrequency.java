import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NumberFrequency {
    // private static HashMap<Integer, Integer> sorted_by_values(HashMap<Integer, Integer> map){
    //     List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());
    //     Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
    //         public int compare(Map.Entry<Integer, Integer> e_1,
    //                            Map.Entry<Integer, Integer> e_2){
    //                             return (e_1.getValue()).compareTo(e_2.getValue());
    //                            }
    //     });
    //     HashMap<Integer, Integer> sorted_map = new HashMap<Integer, Integer>();
    //     for (Map.Entry<Integer, Integer> aa:list){
    //         sorted_map.put(aa.getKey(), aa.getValue());
    //     }
    //     return sorted_map;
    // }
    private static TreeMap<Integer, Integer> sorted_by_key(Map<Integer, Integer> map){
        TreeMap<Integer, Integer> sorted_map = new TreeMap<>();
        sorted_map.putAll(map);
        return sorted_map;
    }
    public static void main(String[] args)throws IOException{
        try(Scanner scan = new Scanner(System.in)){
            int n = scan.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i=0; i < n; i++){
                int n_i = scan.nextInt();
                Iterator<Map.Entry<Integer, Integer> >
                    iterator = map.entrySet().iterator();
                boolean isKeyPresent = false;
                while (iterator.hasNext()) {

                    // Get the entry at this iteration
                    Map.Entry<Integer, Integer> entry = iterator.next();
            
                    // Check if this key is the required key
                    if (n_i == entry.getKey()) {
                        isKeyPresent = true;
                        break;
                    }
                }
                if (isKeyPresent == true){
                    int occurence = map.get(n_i);
                    map.put(n_i, ++occurence);
                }
                else
                    map.put(n_i, 1);
            }
            TreeMap<Integer, Integer> sorted_map = sorted_by_key(map);
            Iterator<Map.Entry<Integer, Integer> >
                iterator = sorted_map.entrySet().iterator();
            
            while (iterator.hasNext()){
                Map.Entry<Integer, Integer> entry = iterator.next();
                System.out.format("%d aparece %d vez(es)%n", entry.getKey(), entry.getValue());
            }
        }
    }    
}
