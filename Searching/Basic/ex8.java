package Searching.Basic;

//Find floor of a number

public class ex8 {
    public static void main(String[] args) {
        int arr2[]={1, 2, 8, 10, 10, 12, 19};
        int n=arr2.length;
        int x=5;

        for(int i=0;i<n;i++){
            if(arr2[i]>x){
                System.out.println("Floor of " + x + " is: " + arr2[i-1]);
                break;
            }
        

        }
        int[] arr = {1, 3, 5, 7, 9};
        int target = 6;

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            }
            else if (arr[mid] < target) {
                ans = arr[mid];
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        System.out.println("Floor = " + ans);
    }
}
