class Author
{
   private String name;
   private String email;
   private char gender;
public Author(String name, String email, char gender) {
	super();
	this.name = name;
	this.email = email;
	this.gender = gender;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
   
}
 class Book extends Author
{
	private String bookName;
	private double price;
	private int qtyInStock;
	public Book( String name, String email, char gender,String bookName, double price, int qtyInStock) {
		super(name,email, gender);
		this.bookName = bookName;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
}
public class  AuthorMain
{
	public static void main(String args[])
	{
	Book b=new Book("Stephen aweking","stephen@gmail.com",'m',"A brief history of Time",150.0,4);
    System.out.println("name:"+ b.getName()+"\n"+"Email:"+b.getEmail()+"\n"+"gender:"+b.getGender()+"\n"+"bname:"+b.getBookName()+"\n"+"Price:"+b.getPrice()+"\n"+"quantity:"+b.getQtyInStock());
	}
}