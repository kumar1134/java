import java.util.Scanner;
public class prbl2{
  public static void main(String[] args){
System.out.println("enter your salary");
Scanner input = new Scanner(System.in);
int salary = input.nextInt();
if (salary<10000) {
  System.out.println("eligeble bonus");
  salary = salary+2000;
  System.out.println(salary);
  //jalijali
}
else
System.out.println("not eligeble take bonus");

  }
}
