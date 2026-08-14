import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        int src = sc.nextInt(), dest = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> vis = new HashSet<>();

        q.add(src);
        vis.add(src);

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == dest) {
                System.out.println("YES");
                return;
            }

            for (int next : graph.getOrDefault(cur, new ArrayList<>())) {
                if (vis.add(next))
                    q.add(next);
            }
        }

        System.out.println("NO");
    }
}
