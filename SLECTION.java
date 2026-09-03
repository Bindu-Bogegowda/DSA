package Sorting;

public class SLECTION {
    public static void main(String[] args){
        int arr[]={32, 45, 18, 32, 8, 67, 3};
        int n=arr.length;
        for(int i=0;i<=n-1;i++){                 //n-1 because last element is already sorted
            int min=i;                           // store the index of the minimum element
            for(int j=i+1;j<=n-1;j++){             //n-i-1 because last i elements are already sorted
                if(arr[j]<arr[min]){             // if current element is less than the minimum element then update min
                    min=j;                       // update the index of the minimum element
                }
            }
            // by finding the maximum element and swapping it with the last element, we can sort the array in ascending order
            /*  for (int i = arr.length - 1; i > 0; i--) {
                    int max = i;
                    for (int j = 0; j < i; j++) {

                    if (arr[j] > arr[max]) {
                        max = j;
                  }
                } */
            int tem=arr[i];
            arr[i]=arr[min];
            arr[min]=tem;
        
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
