import java.util.*;

public class AntikytheraMechanism {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<Integer, Gear> gears = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int Rr = scanner.nextInt();
            gears.put(i, new Gear(x, y, Rr));
        }

        if (!constructGearChain(gears)) {
            System.out.println("Could Not Process");
        } else {
            double rotation = calculateRotation(gears, 1, N);
            System.out.printf("%.2f\n", rotation);
        }

        scanner.close();
    }

    private static boolean constructGearChain(Map<Integer, Gear> gears) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        visited.add(1);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : gears.keySet()) {
                if (!visited.contains(neighbor) && areGearsConnected(gears, current, neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return visited.contains(gears.size());
    }

    private static boolean areGearsConnected(Map<Integer, Gear> gears, int gear1, int gear2) {
        Gear g1 = gears.get(gear1);
        Gear g2 = gears.get(gear2);

        double distance = Math.sqrt(Math.pow(g1.x - g2.x, 2) + Math.pow(g1.y - g2.y, 2));

        return distance <= g1.Rr + g2.Rr;
    }

    private static double calculateRotation(Map<Integer, Gear> gears, int gear1, int gearN) {
        double rotation = 1.0;

        for (int i = gear1; i < gearN; i++) {
            int nextGear = i + 1;
            rotation *= (gears.get(i).Rr * 1.0) / gears.get(nextGear).Rr;
            rotation = -rotation;
        }

        return rotation;
    }

    static class Gear {
        int x, y, Rr;

        public Gear(int x, int y, int Rr) {
            this.x = x;
            this.y = y;
            this.Rr = Rr;
        }
    }
}
