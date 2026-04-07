public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key (you can change this to test different cases)
        String searchKey = "BG309";

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < bogieIDs.length; i++) {
            if (bogieIDs[i].equals(searchKey)) {
                System.out.println("Bogie ID " + searchKey + " found at position " + i);
                found = true;
                break; // Early termination once match is found
            }
        }

        if (!found) {
            System.out.println("Bogie ID " + searchKey + " not found in the train consist.");
        }
    }
}