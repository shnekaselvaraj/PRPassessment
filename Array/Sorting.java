import java.util.*;
public class Sorting
{
  public static void main(String args[])
   {
     int arr[]=new int[args.length];
      for(int i=0;i<args.length;i++)
       arr[i]=Integer.parseInt(args[i]);
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++)
     System.out.println(arr[i]);
     
     
   }
}