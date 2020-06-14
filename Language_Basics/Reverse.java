public class Reverse
{
  public static void main(String args[])
   {
     String s=args[0];
     char arr[]=s.toCharArray();
     for(int i=arr.length-1;i>=0;i--)
       System.out.print(arr[i]);
   }
}