

    import java.util.Scanner;

public class fibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt(); // Number of terms to generate

        int firstTerm = 0, secondTerm = 1;
        int count = 0;

        System.out.println("Fibonacci Series:");
        while (count < n) {
            System.out.print(firstTerm + " "); // Print the current term

            int nextTerm = firstTerm + secondTerm; // Calculate the next term
            firstTerm = secondTerm; // Update firstTerm
            secondTerm = nextTerm; // Update secondTerm

            count++; // Increment the counter
        }
    }
}