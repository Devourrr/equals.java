package week05_day2;

class Person {
	public void sleep(){
		System.out.println("�ܴ�");
	}

}

class Doctor extends Person{
	public void treat() {
		System.out.println("ġ���Ѵ�");
	}
}

class Nurse extends Person{
	public void care() {
		System.out.println("��ȣ�Ѵ�");
	}
}

public class Ex01{
	public static void main(String[]args) {
		Person[]arr = new Person[3];
		
		arr[0] = new Doctor();
		arr[1] = new Doctor();
		arr[2] = new Doctor();
	
		for(int i=0; i<arr.length; i++) {
			if(arr[0] instanceof Doctor) {
				((Doctor)arr[i]).treat();
			}else if(arr[i] instanceof Nurse) {
				 ((Nurse)arr[i]).care();
			  }
			}
		}
	}
