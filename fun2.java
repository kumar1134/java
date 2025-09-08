public class fun2 {
  public static void main(String[] args) {
    String ans = greet("kumar");
    System.out.println(ans);
  }
  static String greet(String name){
    String greeting = "how are you "+name;
    return greeting;
  }
}
