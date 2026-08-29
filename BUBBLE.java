package Sorting;

/**
 * BUBBLE
 */
public class BUBBLE {
    public static void main(String[] args) {
        int[] arr= {32, 45, 18, 32, 8, 67, 3};
        int n=arr.length;
        for(int i=0;i<n-1;i++){                //n-1 because last element is already sorted
            for(int j=0;j<n-i-1;j++){          //n-i-1 because last i elements are already sorted
                if(arr[j]>arr[j+1]){           // if current element is greater than next element then swap
                    int temp=arr[j];           // store current element in temp
                    arr[j]=arr[j+1];           // assign next element to current element
                    arr[j+1]=temp;             // assign temp to next element
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}