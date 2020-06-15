import java.util.*;
public class MaxMin2
{
  public static void main(String args[])
   {
     int arr[]={21,22,23,29,6};
     Arrays.sort(arr);
     System.out.println("min1 "+arr[0]+";min2 "+arr[1]);
     System.out.println("max1 "+arr[arr.length-1]+";max2 "+arr[arr.length-2]);
     
   }
}