import java.util.Scanner;
public class largest {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("enter any three numbers");
    int num1 = num.nextInt();
    int num2 = num.nextInt();
    int num3 = num.nextInt();
    if (num1>num2&&num1>num3) 
    {
      System.out.println("number 1 is gerater than number 2 and 3");
    
    }
    else if (num2>num1&&num2>num3) {
      System.out.println("number 2 is gerater than number 1 and2");
      
    }
    else if (num3>num1&&num3>num2) 
    {
      System.out.println("number 3 is gerater than number 1 and 2");
      
    }
    else
    System.out.println("all are equal");

  }
}
