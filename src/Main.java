import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List <String> words = new ArrayList<>(List.of(
                "вода",
                "картофель",
                "серена",
                "свора",
                "корабль",
                "манекен",
                "корабль",
                "радуга",
                "вода"
        ));

       Set<String> uniqueWords = new HashSet<>(words) ;
        System.out.println(uniqueWords);
    }
}