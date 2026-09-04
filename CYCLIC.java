package Sorting;

public class CYCLIC {
    public static void main(String[] args) {
        int arr[]={4,2,3,1,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]!=i+1){                // if current element is not at its correct position then swap it with the element at its correct position
                int temp=arr[i];               // store current element in temp
                arr[i]=arr[arr[i]-1];          // assign the element at its correct position to current element
                arr[temp-1]=temp;              // assign temp to the element at its correct position
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
