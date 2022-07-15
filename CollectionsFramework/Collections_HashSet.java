import java.util.HashSet;
import java.util.Set;

public class Collections_HashSet {

    // HashSet Datastructure --> Only unique elements are allowed. Order of storing is random.
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();

        hs.add(3);
        hs.add(6);
        hs.add(235);
        hs.add(4);
        hs.add(54);
        hs.add(62);
        hs.add(62);

        System.out.println(hs);

        hs.remove(62);
        System.out.println(hs);

        System.out.println(hs.contains(55));

    }
}
