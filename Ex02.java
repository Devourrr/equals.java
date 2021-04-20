package week05_day2;

class Book{
	String id;
	String title;
	int price;
	public Book() {}
	
	public Book(String id, String title, int price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return id + " " + title + " " + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book tmp = (Book)obj;
		if(this.id == tmp.id) {
			return true;
		}else
			return false;
		}
	}


public class Ex02 {

	public static void main(String[] args) {
		

		Book book = new Book("b001", "점프투자바",18000);
//		System.out.println(book.toString());
		System.out.println(book); //toString 자동호출
		Book book1 = new Book("b002","점프투자바",18000);
		Book book3 = book1;
		Book book2 = new Book("b002", "자바프로그래밍",20000);
		// 같으나 판별메서드 equals(참조형변수값, 주소값 비교) => 오버라이딩(재정의)해서 사용해야함
		boolean result = book.equals(book2);
		System.out.println(result);
	}

}
