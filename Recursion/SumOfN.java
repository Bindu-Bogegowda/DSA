public class SumOfN {
    public static void main(String[] args) {
        int n = 3415; // Example number to calculate sum
        int result = sumOfN(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
    static int sumOfN(int n){
        if(n==0){
            return 0;
        }
        return sumOfN(n/10)+(n%10);
    }
    
    
}
