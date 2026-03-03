import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer input
        int n = scanner.nextInt();
        
        // Logical check for "Weird" vs "Not Weird"
        if (n % 2 != 0) {
            // Condition: n is odd
            System.out.println("Weird");
        } else {
            // Condition: n is even
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
        
        scanner.close();
    }
}
