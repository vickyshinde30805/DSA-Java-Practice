import java.util.Scanner;
public class functions {
   // public static int multiply(int a,int b){
    //    int mul=a*b;
      //  System.out.println(mul);
       // return mul;
    //}
    public static void printcercumference(int r){

      double cercumference=2*3.14*r;
       System.out.println(cercumference);
    }
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the radius of the circle");
     int r=sc.nextInt();//take the name input from the user
     //int b=sc.nextInt();
     //int c=sc.nextInt();
     printcercumference( r);// call the multiply8
     //  function
     
    }
    
}
