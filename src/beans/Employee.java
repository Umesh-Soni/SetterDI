package beans;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class Employee {
	
	private String name;
	private int age;
	private String email;
	private Vector<Book> books;
	private HashSet<Book> oldbooks;
	private HashMap<String,String> qualification;
	private DataBaseProperties driver;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBooks(Vector<Book> books) {
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
		Set<Entry<String,String>> tempSet = qualification.entrySet();
		for(Entry<String,String> temp:tempSet){
			System.out.println("map object value = "+temp.getKey()+"..........."+temp.getValue());
		}
		driver.getPrint();
		
	}
	public void setQualification(HashMap<String, String> qualification) {
		this.qualification = qualification;
	}
	public void setDriver(DataBaseProperties driver) {
		this.driver = driver;
	}
	
}
