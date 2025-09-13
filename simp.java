package exception;

public class simp {
    public static void main(String[] args) {
        int i=0;
        int j=0;

       try{
           j=16/i;
       }
       catch(Exception e){

           System.out.println("something went wrong");
       }
      //  System.out.println("done");
    }
}
