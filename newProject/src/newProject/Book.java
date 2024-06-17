package newProject;

public class Book {
	private int id;
	private String title;
	private String author;
	private int year;
	
	public Book(int id) {
		this.id = id;
	}
	
	public Book(int id, String title, String author, int year) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	@Override
	public String toString() {
        return String.format("Book{id: %d, 제목: %s, 저자: %s, 출판년도: %d}"
        		, this.id, this.title, this.author, this.year);
    }
	
	@Override
	public boolean equals(Object obj) {
		Book tempBook = (Book)obj;
		return this.id == tempBook.id;
	}
}