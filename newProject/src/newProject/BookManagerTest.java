package newProject;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookManagerTestTest {
	private BookManager Junit;
	private List<Book> bookList;
	
	@BeforeEach
	void setUp() {
		Junit  = new BookManager();
		bookList = new ArrayList<Book>();
	}

	@Test
	@Order(1)
	void testAddBook() {
		Junit.addBook(bookList, 1, "자바 기초", "Jane", 2021);
		Junit.addBook(bookList, 1, "자바 기초", "Jane", 2021);
		Junit.searchBook(bookList, 1);
	}

	@Test
	@Order(2)
	void testSearchBook() {
		Junit.addBook(bookList, 1, "자바 기초", "Jane", 2021);
		Junit.addBook(bookList, 2, "소프트웨어 공학", "Tom", 2014);
		Junit.addBook(bookList, 3, "분산 컴퓨팅", "Yoon", 2024);
		Junit.searchBook(bookList, 1);
		Junit.searchBook(bookList, 2);
		Junit.searchBook(bookList, 3);
		Junit.searchBook(bookList, 4);
	}

	@Test
	@Order(3)
	void testRemoveBook() {
		Junit.addBook(bookList, 1, "자바 기초", "Jane", 2021);
		Junit.addBook(bookList, 2, "소프트웨어 공학", "Tom", 2014);
		Junit.removeBook(bookList, 1);
		Junit.removeBook(bookList, 1);
		Junit.searchBook(bookList, 1);
	}
}