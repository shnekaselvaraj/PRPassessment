class Fruit
{
	String name;
	String taste;
	int size;
	public void eat()
	{
		System.out.println("Fruit");
	}
}
 class Apple extends Fruit
 {
	 public void eat()
		{
			System.out.println(name+" "+taste);
		}
 }
 class Orange extends Fruit
 {
	 public void eat()
		{
			System.out.println(name+" "+taste);
		}
 }
public class FruitTest {

	public static void main(String[] args) {
		Orange o=new Orange();
		o.name="orange";
		o.taste="little bitter";
		o.eat();
		Apple a=new Apple();
		a.name="apple";
		a.taste="sweet";
		a.eat();
	}
}
