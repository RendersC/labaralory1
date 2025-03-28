public class Main {
    public static void main(String[] args) {
        //testing problem1
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println(problem1(8,arr)+" | problem1 results");
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



}