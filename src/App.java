
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int reverse = 0, temp, rem;
        temp = n; // Store the original number in temp

        // Use a separate variable for the loop
        int num = n;
        while (num != 0) {
            rem = num % 10; // Extract the last digit
            reverse = (reverse * 10) + rem; // Append it to reverse
            num = num / 10; // Remove the last digit
        }

        // Compare the reversed number with the original
        if (temp == reverse) {
            System.out.println("Yes, it's a Palindrome");
        } else {
            System.out.println("No, it's not a Palindrome");
        }
    }
}