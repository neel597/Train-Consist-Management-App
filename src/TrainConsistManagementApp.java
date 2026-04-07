import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Example 1: Empty bogie array
        String[] emptyBogieIDs = {};
        String searchKey1 = "BG101";

        try {
            int resultIndex = searchBogie(emptyBogieIDs, searchKey1);
            System.out.println("Bogie ID " + searchKey1 + " found at position " + resultIndex);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example 2: Valid bogie array
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey2 = "BG205";

        try {
            int resultIndex = searchBogie(bogieIDs, searchKey2);
            if (resultIndex != -1) {
                System.out.println("Bogie ID " + searchKey2 + " found at position " + resultIndex);
            } else {
                System.out.println("Bogie ID " + searchKey2 + " not found in the train consist.");
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Search method with fail-fast validation
    private static int searchBogie(String[] arr, String key) {
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train consist.");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i; // Match found
            }
        }
        return -1; // Not found
    }
}