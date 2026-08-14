import java.util.*;
import java.util.stream.IntStream;

public class Task4 {
    static int[] lps(String p) {
        int[] l = new int[p.length()];
        for (int i = 1, j = 0; i < p.length();) {
            if (p.charAt(i) == p.charAt(j)) l[i++] = ++j;
            else if (j > 0) j = l[j - 1];
            else i++;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String p = sc.next();

        int[] l = lps(p);
        List<Integer> ans = new ArrayList<>();

        for (int i = 0, j = 0; i < t.length();) {
            if (t.charAt(i) == p.charAt(j)) {
                i++; j++;
                if (j == p.length()) {
                    ans.add(i - j);
                    j = l[j - 1];
                }
            } else if (j > 0) j = l[j - 1];
            else i++;
        }

        IntStream.range(0, ans.size())
                 .forEach(i -> System.out.print(ans.get(i) + " "));
    }
}
