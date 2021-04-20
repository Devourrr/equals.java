package week05_day2;

public class Ex04 {

	public static void main(String[] args) {
		
		
		char ch = 'a'; //char 한문자 저장할 수 있는 자료형
		char[] chs = new char[15]; //배열사용해서 여러 문자 저장
		
		chs[0] = 'h';
		chs[1] = 'e';
		chs[2] = 'l';
		chs[3] = 'l';
		chs[4] = 'o';
		chs[5] = 'w';
		chs[6] = 'o';
		chs[7] = 'r';
		chs[8] = 'l';
		chs[9] = 'd';
		chs[10] = '.';
		chs[11] = 'j';
		chs[12] = 'a';
		chs[13] = 'v';
		chs[14] = 'a';
		
		
		//char[]chs = {'h','e','l','l','o'};
		
		for ( int i=0; i<chs.length; i++) {
			System.out.print(chs[i]);
		}
		
		String str = "helloworld.java";
		String str1 = new String(chs);
		String str2 = new String("helloworld.java");
		
				
				

	}

}
