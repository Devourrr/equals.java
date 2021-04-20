package week05_day2;

public class Ex09 {

	public static void main(String[] args) {
		
		String name = "banana";
		String another = "apple";
		
		//사전상에 앞에 위치 하느냐, 뒤에 위치 하느냐
		//문자열비교 (정렬할 때 필요)
		//문자열 크기 비교, name이 크면(뒤에오면) 양수, 작으면(앞에오면) 음수 같으면 0을 반환함
		
		System.out.println(name.compareTo(another));
		
		
		
		String[] a= {"슬기","지수","사나"};
		
		if(a[0].compareTo(a[1])>0) {
			System.out.println("정렬이 필요하지 않습니다");
			
		}else if(a[1].compareTo(a[2])>0) {
			System.out.println(a[2] + a[0] +a[1]);
		}
	

	}

}
