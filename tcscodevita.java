import java.util.Scanner;

public class tcscodevita {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input compound and equivalent point
        String compound = scanner.nextLine().trim();
        int equivalentPoint = Integer.parseInt(scanner.nextLine().trim());

        // Calculate valency for each element in the compound
        int valency1 = calculateValency(compound.charAt(0));
        int valency2 = calculateValency(compound.charAt(1));

        // Find combinations to balance the compound
        findCombinations(compound.charAt(0), valency1, compound.charAt(1), valency2, equivalentPoint);

        scanner.close();
    }

    private static int calculateValency(char element) {
        int asciiSum = 0;
        for (char c : String.valueOf((int) element).toCharArray()) {
            asciiSum += Character.getNumericValue(c);
        }
        return asciiSum % 9 == 0 ? 9 : asciiSum % 9; // Reduce to one digit
    }

    private static void findCombinations(char element1, int valency1, char element2, int valency2, int equivalentPoint) {
        for (int multiple1 = 1; multiple1 <= equivalentPoint / valency1; multiple1++) {
            int multiple2 = (equivalentPoint - (multiple1 * valency1)) / valency2;
            if ((multiple1 * valency1) + (multiple2 * valency2) == equivalentPoint) {
                System.out.println(element1 + String.valueOf(multiple1) + " " + element2 + String.valueOf(multiple2));
            }
        }
        System.out.println("Not Possible");
    }
}
