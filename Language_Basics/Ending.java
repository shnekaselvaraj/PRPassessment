public class Ending {

	public static void main(String[] args) {
		//String name=args[0];
		//System.out.println("Welcome "+name);
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        String s1=Integer.toString(num1);
        String s2=Integer.toString(num2);
        if(s1.endsWith("7") && s2.endsWith("7"))
        	System.out.println("true");
        else
        	System.out.println("false");
	}

}
