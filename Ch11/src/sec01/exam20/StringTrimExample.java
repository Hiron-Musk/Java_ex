package sec01.exam20;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1=" 02";
		String tel2="123 ";
		String tel3=" 1234 ";
		
		String tel4=tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel4);
	}

}
