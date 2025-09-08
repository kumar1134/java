import java.util.Scanner;

public class count {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int n1 = n.nextInt();
    int count = 0;
    while (n1 > 0) {
      int rem = n1 % 10;
      if (rem == 5) {
        count++;
      }
      n1 = n1 / 10;
    }
    System.out.println(count);

  }

}
