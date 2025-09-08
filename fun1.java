import java.util.Scanner;
public class fun1 {
  public static void main(String[] args) {
   int ans=sum();
   System.out.println("sum= "+ans);
  }
  static int sum(){
    int a,b;
Scanner num = new Scanner(System.in);
System.out.println("enter the number 1: ");
a=num.nextInt();
System.out.println("enter the number two: ");
b=num.nextInt();
 int sum= a+b;
 //System.out.println("sum = "+sum);
 return sum;

  }
}
