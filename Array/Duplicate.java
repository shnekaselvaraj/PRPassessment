import java.util.*;
public class Duplicate
{
  public static void main(String args[])
   {
     int arr[]=new int[args.length];
     LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
      for(int i=0;i<args.length;i++)
      {
       arr[i]=Integer.parseInt(args[i]);
       hs.add(arr[i]);
       }
     for(int i:hs)
     {
    	 System.out.print(i+" ");
     }
     
   }
}