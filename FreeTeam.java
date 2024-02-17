import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FreeTeam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of employees and conflicts
        int n = scanner.nextInt();
        int c = scanner.nextInt();

        // Input conflicts
        int[][] conflicts = new int[c][2];
        for (int i = 0; i < c; i++) {
            conflicts[i][0] = scanner.nextInt();
            conflicts[i][1] = scanner.nextInt();
        }

        // Input expertise levels
        int[] expertise = new int[n];
        for (int i = 0; i < n; i++) {
            expertise[i] = scanner.nextInt();
        }

        // Output the result
        int result = maxExpertise(n, c, conflicts, expertise);
        System.out.println(result);

        scanner.close();
    }

    private static int maxExpertise(int n, int c, int[][] conflicts, int[] expertise) {
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < c; i++) {
            int u = conflicts[i][0];
            int v = conflicts[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n + 1];
        int maxExpertise = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                int[] sum = new int[1];
                dfs(graph, i, visited, expertise, sum);
                maxExpertise += sum[0];
            }
        }

        return maxExpertise;
    }

    private static void dfs(ArrayList<Integer>[] graph, int node, boolean[] visited, int[] expertise, int[] sum) {
        visited[node] = true;
        sum[0] += expertise[node - 1];

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited, expertise, sum);
            }
        }
    }
}
