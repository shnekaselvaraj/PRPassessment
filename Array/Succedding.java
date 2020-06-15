import java.util.*;
public class Succedding
{
  public static void main(String args[])
   {
     int arr[]=new int[args.length];
     int sum=0;
     int flag6=0;
     int flag7=0;
      for(int i=0;i<args.length;i++)
      {
       arr[i]=Integer.parseInt(args[i]);
       if(arr[i]==6)
        flag6=i;
        if(arr[i]==7)
        flag7=i; 
   }
    if(flag7>flag6)
     {
        for(int i=0;i<arr.length;i++)
        {
           if(i<flag6 || i>flag7)
             sum=sum+arr[i];
        }
      }
     else
     {  
        for(int i=0;i<arr.length;i++)
            sum=sum+arr[i];
     }

     System.out.println(sum);
  }
}