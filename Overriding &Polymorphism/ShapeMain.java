class Shape
{
	public void draw()
	{
		System.out.println("Drawing");
	}
	public void erase()
	{
		System.out.println("Ersing");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}
	public void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Square");
	}
	public void erase()
	{
		System.out.println("Erasing Square");
	}
}
public class ShapeMain {

	public static void main(String[] args) 
	{
	
		
		Square s =new Square();
		s.draw();
		s.erase();
		
		
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		
		Circle c=new Circle();
		c.draw();
		c.erase();
	

	}

}
