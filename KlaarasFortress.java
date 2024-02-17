import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KlaarasFortress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows and columns
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Input fortress structure
        int[][] fortress = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                fortress[i][j] = scanner.nextInt();
            }
        }

        // Output the result
        int result = maxTimeToExit(m, n, fortress);
        System.out.println(result);

        scanner.close();
    }

    private static int maxTimeToExit(int m, int n, int[][] fortress) {
        int maxTime = 0;

        // Try blocking each open room and find the longest path
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (fortress[i][j] == 0) {
                    fortress[i][j] = 1; // Block the room
                    int time = bfs(m, n, fortress);
                    maxTime = Math.max(maxTime, time);
                    fortress[i][j] = 0; // Unblock the room for the next iteration
                }
            }
        }

        return maxTime;
    }

    private static int bfs(int m, int n, int[][] fortress) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;

        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];

                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n
                        && fortress[newRow][newCol] == 0 && !visited[newRow][newCol]) {
                        queue.offer(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                    }
                }
            }

            if (!queue.isEmpty()) {
                time++;
            }
        }

        return time;
    }
}

