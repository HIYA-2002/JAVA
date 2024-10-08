public class CalculatePower {
    public static int power(int x,int n){
        if(x==0 && n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int smallAns=power(x,n/2);
        if(n%2==0){
            return smallAns*smallAns;
        }
        else{
            return x*smallAns*smallAns;
        }
    }
    public static void main(String[] args) {
        int n=8;
        int x=8;
        System.out.println(power(x,n));
    }
}