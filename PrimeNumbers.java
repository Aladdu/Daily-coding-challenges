//Java program that generates prime numbers within a specified range and displays them to the user
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + " are:");

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
	}

}
