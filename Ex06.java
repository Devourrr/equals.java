package week05_day2;

public class Ex06 {

	public static void main(String[] args) {
		
		String text = "Love is a variety of different feelings, states,and " +
		"attitudes that ranges from interpersonal affection to pleasure";
		
//		System.out.println(text.toString());
		System.out.println(text);
		
		int cnt=0;
		for(int i=0; i<text.length(); i++)
		{
			if(text.charAt(i) == 't') { //charAt() String으로 저장된 문자열 중에서 한글자만 char타입으로 변환해주는 함수
				cnt++;
			}
		}
		System.out.println("'a'문자의 수 :" + cnt);
		
		

	}

}
