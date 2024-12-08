package predicateoperations.com.example.clientsapps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithCharTest {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Papaya Tree", "Palam Tree", "Cocunut Tree", "JackFroot Tree");
        List<String> treesStartsWithP = stringList.stream().filter(treeName -> treeName.startsWith("P")).collect(Collectors.toList());
        System.out.println("Trees Starts with Letter P -- " + treesStartsWithP);
    }
}
