
public class test {
	public static void main(String[] args) {
	
		String s = "한글이다";
		byte[] b = s.getBytes(); 
		System.out.println(b.length); // 총 바이트를 계산함.
		
		String s1 = new String(b, 0, 4);// -> b 변수에서 4바이트만큼 가져옴.
		String s2 = new String(b, 0, 5);// -> b 변수에서 5바이트만큼 가져옴.
		String s3 = new String(b, 0, 6);// -> b 변수에서 6바이트만큼 가져옴.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
