public class jaap02 {
    public static void main(String[] args) {

        int size = 8;

        // Loop to print each row
        for (int i = 0; i < size; i++) {
            // Loop to print each column in a row
            for (int j = 0; j < size; j++) {
                // Check if the sum of the row and column indices is even or odd
                if ((i + j) % 2 == 0) {
                    System.out.print("B "); // Print Black (B)
                } else {
                    System.out.print("W "); // Print White (W)
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }



}
