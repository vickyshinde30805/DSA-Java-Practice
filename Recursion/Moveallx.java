package Recursion;

public class Moveallx {
    public static void movex(String str,int idx,int count,String newstring){
       if(idx==str.length()){
        for(int i=0;i<count;i++){
            newstring+="x";

        }
        System.out.println(newstring);
        return;
       }
       
        char currentchar=str.charAt(idx);
        if(currentchar=='x'){
            count++;
            movex(str,idx+1,count,newstring);
        }
        else{
            newstring+=currentchar;
            movex(str,idx+1,count,newstring);
        }
    }
    public static void main(String []args){
        String str="axbcxxd";
        movex(str,0,0,"");
    }
}
