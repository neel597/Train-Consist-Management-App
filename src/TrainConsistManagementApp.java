import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Array of bogie type names (unsorted)
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original bogie names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort bogie names alphabetically using Arrays.sort()
        Arrays.sort(bogieNames);

        System.out.println("Sorted bogie names (alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}