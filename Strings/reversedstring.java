public class reversedstring {
    public static void main(String [] args){
        StringBuilder sc=new StringBuilder("vicky");

        for(int i=0;i<sc.length()/2;i++){
            int front=i;
            int back =sc.length()-1-i;

         char frontcar =sc.charAt(front);
         char backchar =sc.charAt(back);

         sc.setCharAt(front,backchar);
         sc.setCharAt(back,frontcar);

         
         
        }
        System.out.println(sc);
    }
}
