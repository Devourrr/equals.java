package week05_day2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "world";
		
		boolean result = str1.equals(str2);
		System.out.println(result);
		
		//�̸��� "STOP"�� �ƴҵ��� �ݺ��ϴ� ��
		
		String name = "";
		Scanner sc = new Scanner(System.in);
		name = sc.next();	// next() - ���� �Ǵ� ���ڿ��� �������������� �Ѵܾ� �Ǵ� �ѹ��ھ� �Է� �޴´�. nextLine() - ���� �Ǵ� ���� �Ѷ��� ��ü�� �Է¹޴´�.
		while(!name.equals("stop")) {
			System.out.println( name + "�� �̸����� �ԷµǾ����ϴ�");
			name = sc.next();
		}
		System.out.println("�����մϴ�"); //���ڿ��񱳴� �ݵ�� equal ���
		// name == "STOP" �Ұ��� //!name.equals("Stop")

	}

}
