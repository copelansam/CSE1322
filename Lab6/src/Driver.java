import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        int number = scan.nextInt();
        FibFormula formula = new FibFormula();
        FibIteration iteration = new FibIteration();
        System.out.println("Fib of " + number + " by iteration is: " + iteration.calculate_Fib(number));
        System.out.println("Fib of " + number + " by formula is: " + formula.calculate_Fib(number));
    }
}
