package week05_day2;

public class Ex09 {

	public static void main(String[] args) {
		
		String name = "banana";
		String another = "apple";
		
		//������ �տ� ��ġ �ϴ���, �ڿ� ��ġ �ϴ���
		//���ڿ��� (������ �� �ʿ�)
		//���ڿ� ũ�� ��, name�� ũ��(�ڿ�����) ���, ������(�տ�����) ���� ������ 0�� ��ȯ��
		
		System.out.println(name.compareTo(another));
		
		
		
		String[] a= {"����","����","�糪"};
		
		if(a[0].compareTo(a[1])>0) {
			System.out.println("������ �ʿ����� �ʽ��ϴ�");
			
		}else if(a[1].compareTo(a[2])>0) {
			System.out.println(a[2] + a[0] +a[1]);
		}
	

	}

}
