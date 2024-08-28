package aggregation;

public class Author {
	String authorname;
	String place;
	Book b;//Aggregation(Has A relationship) - reference variable of the first class.output will get it for both the class.means same output  will be displayed for both Book and Author(Indirect relationship)
	
	public Author(String authorname, String place,Book b)
	{
	this.authorname=authorname;
	this.place=place;
	this.b=b;
	}
	
	public void print()
	{
		System.out.println(b.age+ " " +b.name+" ");
		System.out.println(authorname+" "+place );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book c = new Book("Hello", 10);
		Author a = new Author("Tom","Ekrlm",c);
		a.print();
	}

}
