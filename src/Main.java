import java.util.*;

public class Main {
    static List<String> words = new ArrayList<>(List.of(
            "если", "бы", "солнце", "восходило",
            "на", "западе", "солнце",
            "было", "бы", "реверсивным"
    ));
    public static void main(String[] args) {


        Map<String, Integer> result = new HashMap<>();
        Set <String> unique = new HashSet<>(words) ;
        for (String string: unique){

            if (Collections.frequency(words, string) != 1) {
                result.put(string, Collections.frequency(words, string)) ;
            }
            }
        
        System.out.println(result);
        }


//        кол-ва уникальных слов
        public static void task4() {
            Set <String> unique = new HashSet<>(words) ;
            System.out.println(words.size() - unique.size());
        }
    }
