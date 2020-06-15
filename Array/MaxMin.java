import java.util.*;
public class MaxMin
 {
   public static void main(String args[])
    {
      int arr[]={11,12,13,14,15};
      Arrays.sort(arr);
      System.out.println("min "+arr[0]);
      System.out.println("max "+arr[arr.length-1]);
      }
}