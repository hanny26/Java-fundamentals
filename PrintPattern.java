public class PrintPattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        int m = 5; // Number of columns
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Print '*' for the first and last rows, or for the first and last columns in the middle rows
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
