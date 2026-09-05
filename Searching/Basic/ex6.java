package Searching.Basic;

//Find the second largest element

public class ex6 {
    public static void main(String[] args) {
        int arr[] = {32, 18, 75, 8, 67, 3};
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+secondLargest);

    }
    
} 
