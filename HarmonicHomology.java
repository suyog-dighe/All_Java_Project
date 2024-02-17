import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class HarmonicHomology {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of parent nodes
        int n = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        // Input hierarchy
        HashMap<String, Set<String>> hierarchy = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" : ");
            String parent = parts[0];
            String[] children = parts[1].split(" ");
            Set<String> childSet = new HashSet<>();
            for (String child : children) {
                childSet.add(child);
            }
            hierarchy.put(parent, childSet);
        }

        // Input melodies
        String melody1 = scanner.nextLine();
        String melody2 = scanner.nextLine();

        // Input A, B, C
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // Output the result
        int result = maxConcordanceScore(hierarchy, melody1, melody2, A, B, C);
        System.out.println(result);

        scanner.close();
    }

    private static int maxConcordanceScore(HashMap<String, Set<String>> hierarchy, String melody1, String melody2, int A, int B, int C) {
        int concordanceScore = 0;

        String[] tunes1 = melody1.split("-");
        String[] tunes2 = melody2.split("-");

        int i = 0, j = 0;

        while (i < tunes1.length && j < tunes2.length) {
            String tune1 = tunes1[i];
            String tune2 = tunes2[j];

            if (tune1.equals(tune2)) {
                // Tunes are similar
                concordanceScore += A;
                i++;
                j++;
            } else {
                // Tunes are not similar, decrease concordance score by B
                concordanceScore -= B;

                // Move to the next tune in the melody with the smaller tune
                if (hierarchy.containsKey(tune1) && (hierarchy.get(tune1).contains(tune2) || hierarchy.get(tune1).isEmpty())) {
                    i++;
                } else if (hierarchy.containsKey(tune2) && (hierarchy.get(tune2).contains(tune1) || hierarchy.get(tune2).isEmpty())) {
                    j++;
                } else {
                    // If no direct relation, remove a tune
                    concordanceScore -= C;
                    i++;
                    j++;
                }
            }
        }

        // Handle remaining tunes in the melodies
        while (i < tunes1.length) {
            concordanceScore -= C;
            i++;
        }

        while (j < tunes2.length) {
            concordanceScore -= C;
            j++;
        }

        return concordanceScore;
    }
}
