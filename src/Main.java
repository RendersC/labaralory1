public class Main {
    public static void main(String[] args) {
        //testing problem1
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println(minValue(8,arr));
        System.out.println(avgValue(8,arr));
        System.out.println(isPrime( 29,2));
        System.out.println(factorial(5));
        System.out.println(power(3,2));
        System.out.println(fibonacci(5));


    }


    /*
    *In this problem we find minimum value in array
    * Time Complexity O(n)
     */
    public static int minValue(int n,int[] arr) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }


    /*
    *Finds the average value of an array
    * Time Complexity O(n)
     */
    public static float avgValue(int n,int[] arr) {
        float avg = 0;
        for (int i = 0; i < n; i++) {
            avg += arr[i];
        }
        return avg/n;
    }


    /**
     * Checks whether a number is prime using recursion.
     * Time Complexity: O(√n)
     */
    public static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }


    /**
     * Computes the factorial of a number
     * Time Complexity: O(n)
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }


    /**
     * Computes a^n
     * Time Complexity: O(log n)
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        int half = power(a, n / 2);
        return (n % 2 == 0) ? half * half : half * half * a;
    }


    /**
     * Finds the Fibonacci number
     * Time Complexity: O(2^n)
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    /**
     * Reverse array
     * Time Complexity: O(n)
     */
    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left + 1, right - 1);
    }


    /**
     * Checks if a string consists only of digits
     * Time Complexity: O(n)
     */
    public static boolean isDigitString(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isDigitString(s, index + 1);
    }


    /**
     * Computes binomial coefficient
     * Time Complexity: O(2^n)
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }


    /**
     * Computes GCD using the Euclidean algorithm
     * Time Complexity: O(log min(a, b))
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}