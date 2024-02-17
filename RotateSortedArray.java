public class RotateSortedArray {
    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1; // Return -1 when the element is not found
        }
        int mid = si + (ei - si) / 2;

        // Case: Found
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            // Case a: Left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // Case b: Right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }
        // Case c: Right search
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // Case d: Search in left
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 2,8, 5, 0, 1, 4};
        int target = 4;
        int taridx = search(arr, target, 0, arr.length - 1);

        if (taridx == -1) {
            System.out.println("Target not found in the array");
        } else {
            System.out.println("Target found at index: " + taridx);
        }
    }
}
