package Searching.Basic;

//Find insertion position

public class ex7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int n = arr.length;
        int x = 5;
        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            position = n; // Insert at the end if x is greater than all elements
        }

        System.out.println("Insertion position for element " + x + " is: " + position);
    


    



    

        int[] arr2 = {1, 3, 5, 6};
        int target = 4;

        int start = 0;
        int end = arr2.length - 1;
        int ans = arr2.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr2[mid] == target) {
                ans = mid;
                break;
            }
            else if (arr2[mid] < target) {
                start = mid + 1;
            }
            else {
                ans = mid;
                end = mid - 1;
            }
        }

        if (ans == arr2.length) {
            ans = start;
        }

        System.out.println("Insertion position: " + ans);
}
} 

