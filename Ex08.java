package week05_day2;

public class Ex08 {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "hello";
		
		System.out.println(a==b);	
		System.out.println(a.equals(b));
		//
		
		String c = new String("hello");	 // ==�� ������������ ��
		String d = new String("hello");  // c.equals(d)�� ������ ��
		
		System.out.println(c==d); //false hip����(������)�� �ٸ� ���δٸ� �޸� �Ҵ� ����
		System.out.println(c.equals(d)); //true

	}

}
