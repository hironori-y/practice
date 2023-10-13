public class Book extends TangibleAsset{
	private String isbn;
	public Book(string name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}

	pubic String getlsbn(){ return this.isbn;}
}
