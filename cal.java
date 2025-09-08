import java.util.Scanner;

public class cal {
  public static void main(String[] args) {
    Scanner opr = new Scanner(System.in);
    int ans = 0;
    while (true) {
      System.out.println("enter the opertor");
      char op = opr.next().trim().charAt(0);
      if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
        System.out.println("enter the two number");
        int n1 = opr.nextInt();
        int n2 = opr.nextInt();
        if (op == '+') {
          ans = n1 + n2;
        }
        if (op == '-') {
          ans = n1 - n2;
        }
        if (op == '*') {
          ans = n1 * n2;
        }
        if (op == '/') {
          if (n2 != 0) {
            ans = n1 / n2;
          }
        }
        if (op == '%') {
          ans = n1 % n2;
        }

      } else if (op == 'x' || op == 'X')
        break;
      else
        System.out.println("invalid input");
      break;

    }
    System.out.println(ans);
  }
}
