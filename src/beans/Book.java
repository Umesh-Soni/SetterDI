package beans;

public class Book {
	
	private String code;
	private String name;
	private String author;
	private Integer year;
	
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Book [code=" + code + ", name=" + name + ", author=" + author
				+ ", year=" + year + "]";
	}
	
	
}
