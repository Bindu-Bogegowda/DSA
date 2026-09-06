public class ReverseN {
    static int rev=0;
    public static void main(String[] args) {
        int n= 12345;
       
        reverseN1(n);
        System.out.println("Reverse of " + n + " is: " + rev);

    }
      /*public static void main(String[] args) {
        int n= 12345;
       
        int result=reverseN(n,0);
        System.out.println("Reverse of " + n + " is: " + result);

    }
    static int reverseN(int n,int rev){
        if(n==0){
            return rev;
        }
        int rem= n%10;
        rev=(rev * 10)+rem;
        return reverseN(n/10,rev);
    }*/
    static void reverseN1(int n){
        if(n==0){
            return ;
        }
       
        int rem= n%10;
        rev=(rev * 10)+rem;
         reverseN1(n/10);
    }

}
