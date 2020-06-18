
public class HalfString {

	public static void main(String[] args) {
		String input=args[0];
		if(input.length()%2==0)
			System.out.println(input.substring(0, input.length()/2));
		else
			System.out.println("null");
	}

}
