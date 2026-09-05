package Searching.Basic;

//Find the first occurrence of an element and Find the last occurrence of an element

public class ex3 {
    public static void main(String[] args){
        int[] arr={32, 54, 18, 23, 8, 67, 32};
        int n = arr.length;
        int x=32;
        int first=-1;
        int last=-1;
        
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        if(first!=-1){
            System.out.println("First occurrence of element "+x+" is at index: "+first);
            System.out.println("Last occurrence of element "+x+" is at index: "+last);
        }else{
            System.out.println("Element not found");
        }
    }
    
}
// by using binary search we can find the first and last occurrence of an element in a sorted array.

    /* public class FirstLastOccurrence {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;

        int first = -1;
        int last = -1;

        // Find first occurrence
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;       // Search left
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // Find last occurrence
        start = 0;
        end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;     // Search right
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
} */