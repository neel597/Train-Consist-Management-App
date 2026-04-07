import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs (unsorted initially)
        String[] bogieIDs = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Sort the array first (precondition for binary search)
        Arrays.sort(bogieIDs);

        System.out.println("Sorted bogie IDs: " + Arrays.toString(bogieIDs));

        // Search key (you can change this to test different cases)
        String searchKey = "BG309";

        // Perform binary search
        int resultIndex = binarySearch(bogieIDs, searchKey);

        if (resultIndex != -1) {
            System.out.println("Bogie ID " + searchKey + " found at position " + resultIndex);
        } else {
            System.out.println("Bogie ID " + searchKey + " not found in the train consist.");
        }
    }

    // Binary Search Implementation
    private static int binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return mid; // Match found
            } else if (comparison < 0) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }
        return -1; // Not found
    }
}