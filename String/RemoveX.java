
public class RemoveX {

	public static void main(String[] args) {
		String input=args[0].toLowerCase();
		if(input.startsWith("x")|| input.endsWith("x"))
			System.out.println(input.replace("x", ""));
		else
			System.out.println(input);

	}

}
