package LogicalStatements;

public class SmithNumber {

    public static void main(String[] args) {
        int n = 204;

        if (!isPrime(n) && digitSum(n) == findPrimeFactorsDigitSum(n)) {
            System.out.println(n + " is a Smith Number!");
        } else {
            System.out.println(n + " is NOT a Smith Number!");
        }
    }

    // Calculate sum of digits
    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    

    // Check prime number (efficient way)
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }

    // Find sum of digits of prime factors
    private static int findPrimeFactorsDigitSum(int n) {
        int sum = 0;
        // Check for factor 2
        while (n % 2 == 0) {
            sum += digitSum(2);
            n /= 2;
        }
        // Check for odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                sum += digitSum(i);
                n /= i;
            }
        }

        // If n is still > 1, it's prime
        if (n > 1) {
            sum += digitSum(n);
        }

        return sum;
    }
}
