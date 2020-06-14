public class Percentage
{
  public static void main(String args[])
  {
   String gender=args[0].toLowerCase();
   int age=Integer.parseInt(args[1]);
   if(gender.equals("male") && age>=1 && age<=58)
     System.out.println("8.4%");
   else if(gender.equals("male") && age>=59 && age<=100)
     System.out.println("10.5%");
   else if(gender.equals("female") && age>=1 && age<=58)
     System.out.println("8.2%");
   else if(gender.equals("female") && age>=59 && age<=100)
     System.out.println("9.2%");
   }
}