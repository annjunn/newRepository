package newProject;

import java.util.List;

public class BookManager {

	public void addBook(List<Book> bookList, int id, String title, String author, int year) {
		Book tempBook = new Book(id, title, author, year);
		
		if(bookList.contains(tempBook)) {
			System.out.println("해당 ID(" + id + ")는 이미 존재합니다.");
			return;
		}
		else {
			bookList.add(tempBook);
			System.out.println(tempBook + "도서가 추가되었습니다.");
		}
	}

	public void searchBook(List<Book> bookList, int id) {
		Book tempBook = new Book(id);
		
		if(bookList.contains(tempBook)) {
			int inx = bookList.indexOf(tempBook);
			tempBook = bookList.get(inx);
			System.out.println("검색 결과:");
			System.out.println(tempBook);
		} 
		else {
			System.out.println("검색된 도서가 없습니다.");
			return;
		}
	}

	public void removeBook(List<Book> bookList, int id) {
		Book tempBook = new Book(id);
		
		if(bookList.contains(tempBook)) {
			int idx = bookList.indexOf(tempBook);
			tempBook = bookList.get(idx);
			bookList.remove(idx);
			System.out.println(tempBook + "도서를 삭제하였습니다.");
		}
		else {
			System.out.println("해당 ID(" + id + ")의 도서를 찾을 수 없습니다.");
			return;
		}
	}
}