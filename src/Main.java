public class Main {
    public static void main(String[] args) {
        //testing problem1
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println(problem1(8,arr)+" | problem1 results");
        System.out.println(problem2(8,arr)+" | problem2 results");
    }


    /*
    *In this problem we find minimum value in array
    * Time complexity O(n)
     */
    public static int problem1(int n,int[] arr) {
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
    * Time complexity O(n)
     */
    public static float problem2(int n,int[] arr) {
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
}