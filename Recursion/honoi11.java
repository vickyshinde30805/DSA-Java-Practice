package Recursion;

public class honoi11 {
    public static void honoi(int n,String src,String helper,String dest){
        if (n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        
        }
        honoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        honoi(n-1,helper,src,dest);
        return;

    }
    public static void main(String [] args){
        int n=4;
        honoi(n,"S","H","D");
    }
    
}
