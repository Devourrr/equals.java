package week05_day2;

public class Ex03 {

	public static void main(String[] args) {
		
		//주민번호
		String id = "20010912201411";

		System.out.println(id.charAt(5));	//charAt(index)
		
		System.out.println(id.substring(0)); //substring(beginindex)
		System.out.println(id.substring(0, 6)); //substring(beginindex, endindex)
		System.out.println(id.substring(0, 6));
		System.out.println(id.substring(6, 8));
		System.out.println(id.substring(8, 13));
		System.out.println(id.substring(6, 7));
		
		
		String day = id.substring(6,7);
		
		int day1 = Integer.parseInt(day); //Integer.parseInt(i): 문자형을 숫자형으로 치환해주는 함수
		String male = "남자입니다";
		String female = "여자입니다";

		//성별에 따라 남=> 남자입니다. 여=> 여자입니다.
		// 숫자로 사용해야 한다면 Integer.parseInt();

		if (day1 == 1){
			System.out.println(male);
		}else {
			System.out.println(female);
	
	}

}
}
