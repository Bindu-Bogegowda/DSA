public class SortedArr {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        boolean result = Sorted(arr,0);
        System.out.println(result);

    }
    static boolean Sorted( int arr[], int index){
        if(index==arr.length-1){
            return true;
        }
       /* if(arr[index]>arr[index+1]){
            return false;
        }
        return Sorted(arr, index+1);*/
        return (arr[index]<=arr[index+1] && Sorted(arr, index+1));
    }
    
}
