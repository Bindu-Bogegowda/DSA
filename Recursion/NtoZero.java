public class NtoZero {
    public static void main(String[] args) {
        int n=15;
        int result=helper(n,0);
        System.out.println(result);
    }
    static int helper(int num,int count){
        if(num == 0){
            return count;
        }
        if(num%2==0){
            return helper(num/2,count+1);

        }

        return helper(num-1, count+1);
    }
}
