package exception;

public class tryf {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        String s = null;
        int[] array ={1,2,3,45,6};
        try {
            j = j / i; // This will cause ArithmeticException
//            System.out.println(array[5]); // This will cause ArrayIndexOutOfBoundsException
//            System.out.println(s.length()); // This will cause NullPointerException
//in this when the first exception occurs, the subsequent lines will not be executed
            // because the control will jump to the catch block.

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
        try {
            System.out.println(array[5]);
        }
    catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index is out of bounds.");
        }
        try {
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: Attempted to access a null object.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed, regardless of exceptions.");
        }
    }
}
