public class Colour
{
  public static void main(String args[])
  {
    char input=args[0].charAt(0);
    switch(input)
    {
      case 'R': System.out.println("Red"); break;
      case 'B': System.out.println("Blue"); break;
      case 'O': System.out.println("orange"); break;
      case 'G': System.out.println("Green"); break;
      case 'Y': System.out.println("Yellow"); break;
      case 'W': System.out.println("White"); break;
    }
   }
 }