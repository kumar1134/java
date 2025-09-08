import java.util.Arrays;

public class maxarr {
  public static void main(String[] args) {
    int[] arr= {9,2,3,45,6};
    System.out.println(Arrays.toString(arr));
int max=arr[0];
for(int i=1; i<arr.length;i++){
if(max<arr[i]){
  max=arr[i];
  
}

  }
  System.out.println("the max value of array is"+" "+max);
  
}
}