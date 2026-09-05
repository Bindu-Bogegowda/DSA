package Searching.Basic;

//Find the largest element and Find the smallest element

public class ex2 {
    public static void main(String[]args){
        int[] arr={32, 54, 18, 23, 8, 67};
        int n = arr.length;
        int largest =arr[0];
        int smallest = arr[0];
        
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest element: "+largest);
        System.out.println("Smallest element: "+smallest);
    }
    
}
