import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter aa integer");
        int n = in.nextInt();
        if (n % 2 == 0) {

            System.out.println("not weird");
        }
        if (n >= 6 && n <= 20) {

            System.out.println("weird");
        }

        if (n > 20) {
            System.out.println("not weird");
        }
    }
}
