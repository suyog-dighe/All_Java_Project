import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class VipCafe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of orders
        int n = scanner.nextInt();

        // Input the priorities of orders
        int[] priorities = new int[n];
        for (int i = 0; i < n; i++) {
            priorities[i] = scanner.nextInt();
        }

        // Input the position of Raj's friend in the queue
        int k = scanner.nextInt();

        // Output the result
        int result = ordersBeforeFriendServed(n, priorities, k);
        System.out.println(result);

        scanner.close();
    }

    private static int ordersBeforeFriendServed(int n, int[] priorities, int k) {
        Queue<Order> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Order(i + 1, priorities[i]));
        }

        int friendPriority = priorities[k - 1];
        int ordersServed = 0;

        while (!queue.isEmpty()) {
            Order currentOrder = queue.poll();

            if (currentOrder.priority == friendPriority) {
                ordersServed++;
                break;
            }

            ordersServed++;
            incrementPriorities(queue, currentOrder);
        }

        return ordersServed;
    }

    private static void incrementPriorities(Queue<Order> queue, Order currentOrder) {
        int currentPriority = currentOrder.priority;

        for (int i = 0; i < queue.size(); i++) {
            Order order = queue.poll();
            if (order.priority < currentPriority) {
                queue.offer(new Order(order.index, order.priority + 1));
            } else {
                queue.offer(order);
            }
        }
    }

    static class Order {
        int index;
        int priority;

        public Order(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
