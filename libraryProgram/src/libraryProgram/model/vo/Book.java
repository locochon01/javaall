package libraryProgram.model.vo;

public class Book {

	private String name; //도서 제목
	private String author; // 저자
	private int price; // 가격
	private String editor; //출판사
	private int number; //도서등록번호
	
	public Book() {}

	public Book(String name, String author, int price, String editor, int number) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.editor = editor;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", editor=" + editor + ", number="
				+ number + "]";
	}
		
	
}
	
	

	