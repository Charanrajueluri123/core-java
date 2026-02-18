package daily_practice;

public class Book {
	int book_id;
	String title;
	String author;
	double price;
	static int dis=10;
	
	
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", title=" + title + ", author=" + author + ", price=" + price + 
				", Actual Price="  + price +", After Discount 10% is=" + (price-(price*dis/100));
	}


	public Book(int book_id, String title, String author, double price) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.dis = dis;
	}

	
	void charan() {
		System.out.println("print book id:"+book_id);
	}

	public static void main(String[] args) {
		
		Book b=new Book(1,"the art of love","karthik",5000.0);
		Book b1=new Book(2,"the art of ac","karthik1",6000.0);
		Book b2=new Book(3,"the art of sir","karthik2",7000.0);
		Book b3=new Book(4,"the art of courage","karthik3",8000.0);
		System.out.println(b.toString());
		b.charan();
		System.out.println(b1.toString());
		b1.charan();
		System.out.println(b2.toString());
		b2.charan();
		System.out.println(b3.toString());
		b3.charan();
		
	}
}
