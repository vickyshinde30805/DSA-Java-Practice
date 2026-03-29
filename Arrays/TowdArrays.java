
import java.util.Scanner;

public class TowdArrays {
    public static void main(String args[]){
         Scanner sc = new  Scanner (System.in);
         int rows = sc.nextInt();
         int cols = sc.nextInt();

         int numbers[][]=new int [rows][cols];

         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 numbers[i][j]=sc.nextInt();
             }
         }

         int x =5;
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                if(x==numbers[i][j]){
                    System.out.print("no found at "+i+" "+j);
                }
             } 
         }
         sc.close();
    }
    }
