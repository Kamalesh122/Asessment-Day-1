class Animal
{
	public void eat()
	{
		
	System.out.println("All Animal are Eating");
	}
	public void sleep()
	{
		
	System.out.println("All Animal are Sleeping");
	}
}
class Bird extends Animal
{
	public void eat()
	{
		//super.eat();
	System.out.println(" Bird is Eating");
	}
	public void sleep()
	{
		//super.sleep();
	System.out.println("Bird is Sleeping");
	}
	public void fly()
	{
		System.out.println("Bird is Flying");
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.eat();
		a.sleep();
        Bird b= new Bird();
        b.eat();
        b.sleep();
        b.fly();
	}

}
