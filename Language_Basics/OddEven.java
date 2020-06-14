public class OddEven
   {
     public static void main(String args[])
     {
       int num=Integer.parseInt(args[0]);
       if(num==1 || num==0)
        System.out.println(num+" is neither odd nor even");
       else if(num%2==0)
          System.out.println(num+" is even");
       else
          System.out.println(num+" is odd");
     }
}