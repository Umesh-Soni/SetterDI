package beans;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Employee {
	
	private String name;
	private int age;
	private String email;
	private List<Book> books;
	private HashSet<Book> oldbooks;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void setOldbooks(HashSet<Book> oldbooks) {
		this.oldbooks = oldbooks;
	}
	
	public void printEmployee(){
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Email = "+email);
		System.out.println("Book = ");
		Iterator<Book> tempBook = books.iterator();
		while (tempBook.hasNext()) {
			System.out.println(tempBook.next());
		}
		tempBook = oldbooks.iterator();
		while (tempBook.hasNext()) {
			System.out.println(tempBook.next());
		}
	}
	
}
