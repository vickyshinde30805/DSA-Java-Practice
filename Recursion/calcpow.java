package Recursion;


public class calcpow {
    public static int calcpower1(int x,int n){
        if(n==0){return 1;}//base case 1
        if(x==0){return 0;}// base case 2
        int xpowernm1=calcpower1(x,n-1);
        int xpower=x*xpowernm1;
        return xpower;
    }

    public static void main(String args[]){

        int x=2;
        int n=5;
        int ans=calcpower1(x,n);
        System.out.println(ans);
    }
    
}
