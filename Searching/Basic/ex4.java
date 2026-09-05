package Searching.Basic;

//Count occurrences of an element

public class ex4 {
    public static void main(String[] args) {
        int[] arr = {32, 54, 18, 32, 8, 67, 32};
        int n = arr.length;
        int count = 0;
        int x = 32;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("Number of occurrences of element " + x + " is: " + count);
    }
    
}
