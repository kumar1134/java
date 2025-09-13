package exception;

public class THrow {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0) {
                throw new ArithmeticException("divisible by higher number is not possible");
            }
           // System.out.println("  ");
        }
        catch (ArithmeticException e1){

            System.out.println("divisible by zero is not possible "+ e1.getMessage());
        }
        catch (Exception e){

            System.out.println("something happend!! ");
        }
        System.out.println(j);
    }
}
