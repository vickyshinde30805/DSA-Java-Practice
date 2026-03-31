package Recursion;

public class factorial {
    public static int printfact(int n){
        if(n==1||n==0){
            return 1;

        }
        int fact_1=printfact(n-1);
        int fact=n*fact_1;
        return fact;

    }
    public static void main(String args[]){
        int n=6;
        int ans =printfact(n);
        System.out.println(ans);

    }
    
}
