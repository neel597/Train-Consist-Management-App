public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Passenger bogie capacities (unsorted)
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original capacities:");
        printArray(capacities);

        // Bubble Sort Algorithm
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap adjacent values
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted capacities (ascending):");
        printArray(capacities);
    }

    // Utility method to print array
    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}