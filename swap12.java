import java.util.Arrays;
import java.util.Scanner;

public class swap12 {
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    Swap(arr, 3, 2);
    System.out.println(Arrays.toString(arr));
  }

  static void Swap(int[] arr, int index1, int index2) {
    System.out.println("enter the index1 of the number ");
    index1 = in.nextInt();
    System.out.println("enter second index");
    index2 = in.nextInt();
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;

  }

}
