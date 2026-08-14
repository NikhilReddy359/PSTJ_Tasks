import java.util.*;
import java.util.stream.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> map = new LinkedHashMap<>();

        IntStream.range(0, n)
                .mapToObj(i -> sc.nextLine())
                .forEach(s -> map.merge(s, 1, Integer::sum));

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
