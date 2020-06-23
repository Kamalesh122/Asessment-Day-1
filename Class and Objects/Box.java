public class Box {
int width;
int hight;
int depth;

public Box(int width, int hight, int depth) {
	super();
	this.width = width;
	this.hight = hight;
	this.depth = depth;
}

public int volume()
{
	return ( this.width*this.hight*this.depth );
}
public static void main(String args[])
{
	Box b=new Box(2,3,6);
	int s=b.volume();
	System.out.println(s);
}

}
