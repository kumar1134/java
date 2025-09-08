import java.util.Scanner;
public class temp {
  public static void main(String[] args) {
    System.out.println("please enter the temperature in celcious");
    Scanner temp = new Scanner (System.in);
float tempc = temp.nextInt();
float tempf = (tempc*9/5)+32;
System.out.println("the temperature in farient are "+tempf);  
}
  
}
