public class DigitSum
{
  public static void main(String args[])
   {
     String s=args[0];
     char arr[]=s.toCharArray();
     int sum=0;
     for(int i=0;i<arr.length;i++)
      sum=sum+Integer.parseInt(Character.toString(arr[i]));
     System.out.println(sum);
   }
}