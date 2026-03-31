package Recursion;
public class Recursion{
    public static int printnumber(int n){
        if(n==0)
            {
                return 0;
            }
        System.out.println(n);
        printnumber(n-1);

        return 0;
    }

    public static void main (String []args){
        int n =5;
        printnumber(n);
    }
}