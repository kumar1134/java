import java.util.Scanner;
public class Casecheck {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char ch = in.next().trim().charAt(0);
    System.out.println(ch);
    if(ch>='a'&&ch<='z'){
      System.out.println("lowerCase");
    }
    else{
      System.out.println("upperCse");
    }


    
  }
  
}
