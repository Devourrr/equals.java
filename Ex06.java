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
			if(text.charAt(i) == 't') { //charAt() String���� ����� ���ڿ� �߿��� �ѱ��ڸ� charŸ������ ��ȯ���ִ� �Լ�
				cnt++;
			}
		}
		System.out.println("'a'������ �� :" + cnt);
		
		

	}

}
