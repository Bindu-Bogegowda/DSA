package Searching;

public class LINEAR {
  static int linearSearch(int arr[], int n, int x) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String args[]) {
    int arr[] = { 2, 3, 4, 10, 40 };
    int x = 10;
    int n = arr.length;
    int result = linearSearch(arr, n, x);
    if (result == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index " + result);
    }
  }
    
}
