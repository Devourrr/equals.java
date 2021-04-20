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
		

		Book book = new Book("b001", "�������ڹ�",18000);
//		System.out.println(book.toString());
		System.out.println(book); //toString �ڵ�ȣ��
		Book book1 = new Book("b002","�������ڹ�",18000);
		Book book3 = book1;
		Book book2 = new Book("b002", "�ڹ����α׷���",20000);
		// ������ �Ǻ��޼��� equals(������������, �ּҰ� ��) => �������̵�(������)�ؼ� ����ؾ���
		boolean result = book.equals(book2);
		System.out.println(result);
	}

}
