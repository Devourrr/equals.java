package week05_day2;

public class Ex03 {

	public static void main(String[] args) {
		
		//�ֹι�ȣ
		String id = "20010912201411";

		System.out.println(id.charAt(5));	//charAt(index)
		
		System.out.println(id.substring(0)); //substring(beginindex)
		System.out.println(id.substring(0, 6)); //substring(beginindex, endindex)
		System.out.println(id.substring(0, 6));
		System.out.println(id.substring(6, 8));
		System.out.println(id.substring(8, 13));
		System.out.println(id.substring(6, 7));
		
		
		String day = id.substring(6,7);
		
		int day1 = Integer.parseInt(day); //Integer.parseInt(i): �������� ���������� ġȯ���ִ� �Լ�
		String male = "�����Դϴ�";
		String female = "�����Դϴ�";

		//������ ���� ��=> �����Դϴ�. ��=> �����Դϴ�.
		// ���ڷ� ����ؾ� �Ѵٸ� Integer.parseInt();

		if (day1 == 1){
			System.out.println(male);
		}else {
			System.out.println(female);
	
	}

}
}
