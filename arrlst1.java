import java.util.ArrayList;

public class arrlst1 {
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<>();
        name.add(8);
        name.add(9);
        System.out.println(name);
name.remove(1);
System.out.println(name);
arrlist2();
        
    }
    static void arrlist2() {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            num.add(i); // Add elements to the list
        }
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i)+" "); // Now safe to access
        }
    
    }
}        