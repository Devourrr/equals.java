package week05_day2;

public class Ex08 {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "hello";
		
		System.out.println(a==b);	
		System.out.println(a.equals(b));
		//
		
		String c = new String("hello");	 // ==는 참조변수값만 비교
		String d = new String("hello");  // c.equals(d)는 내용을 비교
		
		System.out.println(c==d); //false hip영역(번지수)이 다름 서로다른 메모리 할당 영역
		System.out.println(c.equals(d)); //true

	}

}
