public class Calculator
{
    public static int powerInt(int x,int y)
    {
    	return (int) Math.pow(x,y);
    }
    public static double powerDouble(double x,double y)
    {
    	return  Math.pow(x,y);
    }
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		System.out.println(c.powerInt(4, 2));
		System.out.println(c.powerDouble(4, 2));
		
	}

}
