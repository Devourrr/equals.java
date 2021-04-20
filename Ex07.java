package week05_day2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "world";
		
		boolean result = str1.equals(str2);
		System.out.println(result);
		
		//이름이 "STOP"이 아닐동안 반복하는 것
		
		String name = "";
		Scanner sc = new Scanner(System.in);
		name = sc.next();	// next() - 문자 또는 문자열을 공백을기준으로 한단어 또는 한문자씩 입력 받는다. nextLine() - 문자 또는 문장 한라인 전체를 입력받는다.
		while(!name.equals("stop")) {
			System.out.println( name + "이 이름으롱 입력되었습니다");
			name = sc.next();
		}
		System.out.println("종료합니다"); //문자열비교는 반드시 equal 사용
		// name == "STOP" 불가능 //!name.equals("Stop")

	}

}
