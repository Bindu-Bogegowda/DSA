package Sorting;

public class INSERTION {
    public static void main(String[] args) {
        int arr[]={32, 45, 18, 32, 8, 67, 3};
        int n=arr.length;
      /*   for(int i=1;i<n;i++){                 //n-1 because last element is already sorted
            int key=arr[i];                   // store the current element in key
            int j=i-1;                        // store the index of the previous element in j
            while(j>=0 && arr[j]>key){        // if previous element is greater than key then shift it to the right
                arr[j+1]=arr[j];              // shift the previous element to the right
                j--;                          // decrement j to check the next previous element
            }
            arr[j+1]=key;                     // insert the key at the correct position
        } */
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }


        for(int i=0;i<n;i++){ 
            System.out.print(arr[i]+" ");
        }
    }
    
}
