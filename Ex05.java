package week05_day2;

public class Ex05 {

	public static void main(String[] args) {
		
		String date1 = new String("2018-02-19");
		String[]s = date1.split("-");
		
		for(int i=0; i<s.length; i++)
		{
			if(Integer.parseInt(s[i])< 10 && s[i].contains("0"))
				s[i] = s[i].replace("0", "");
		
		System.out.println(s[0] + "." + s[1] + "." + s[2]);

	}

}
}
