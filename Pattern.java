public class Main {
    public static void main(String[] args) {
        // Loop through each row (1 to 4)
        for (int i = 1; i <= 4; i++) {
            // Print leading spaces
            for (int j = 1; j <= (4 - i); j++) {
                System.out.print(" ");
            }
            // Print numbers in descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}