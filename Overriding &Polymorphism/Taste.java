class Fruit
{
	String name;
	String taste;
	
	
	public Fruit(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

   public String getTaste() {
		return taste;
	}

	public void eat()
	{
		System.out.println(getName()+" is "+getTaste());
	}
}
class Apple extends Fruit
{
	public Apple(String name, String taste) {
		super(name, taste);
		// TODO Auto-generated constructor stub
	}

	public void eat()
	{
		System.out.println(getName()+" is "+getTaste());
	}
}
class Orange extends Fruit
{
	
	public Orange(String name, String taste) {
		super(name, taste);
		// TODO Auto-generated constructor stub
	}

	public void eat()
	{
		System.out.println(getName()+" is "+getTaste());
	}
}

public class Taste {

	public static void main(String[] args)
	{
		Orange o=new Orange("Orange","Sour");
		o.eat();
        Apple a=new Apple("Apple","Sweet");
        a.eat();
	}

}
