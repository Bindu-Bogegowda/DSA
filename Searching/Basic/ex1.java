package Searching.Basic;

//Find an element in an array and Find the index of an element in an array

public class ex1 {
    public static void main(String[] args){
        int[] arr= {32, 54, 18, 32, 8, 67, 3};
        int n=arr.length;
        int x=32;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element found at index:" +i);
                System.out.println("Element is:" +arr[i]);
                
            }
        }
    }
    
}
