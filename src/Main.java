import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of(
                "если", "бы", "солнце", "восходило",
                "на", "западе", "солнце",
                "было", "бы", "реверсивным"
        ));

        Map<String, Integer> result = new HashMap<>();
        Set <String> unique = new HashSet<>(words) ;
        for (String string: unique){

            if (Collections.frequency(words, string) != 1) {
                result.put(string, Collections.frequency(words, string)) ;
            }
            }
        
        System.out.println(result);
        }
    }
