import java.util.Arrays;

public class revarr{
  public static void main(String[] args) {
int [] arr={34,5,6,7,4,4};
reverse(arr);
System.out.println(Arrays.toString(arr));
  }
  static void reverse(int[] arr)
  {
     int start=0;
     int end =arr.length-1;
     while(start<end){
Swap(arr,start, end);
start++;
end--;
     }
  }
    static void Swap(int[] arr, int index1, int index2) {
     // System.out.println("enter the index1 of the number ");
      //index1 = in.nextInt();
      //System.out.println("enter second index");
      //index2 = in.nextInt();
      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
    
  
}
}