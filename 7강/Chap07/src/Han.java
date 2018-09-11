// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 1. 한글 계산

// 블랭크 넣는 클래스
public class Han {
	
	// 앞에 블랭크를 붙이는 메소드
	public static String BlankForeword(String str, int kan)
	{
		byte[] byteArr = str.getBytes();		// 문자열 -> 바이트 배열
		
		int blankCount = kan - byteArr.length; // 총 바이트에서 남은 바이트수 계산.
		
		String blank = ""; 						// 남은 바이트수만큼 공백을 만듦.
		for(int i = 1; i <= blankCount; i++)
		{
			blank = blank + " ";
		}
		
		return str = blank + str; 				// 공백 + 기존문자 반환.
	}
	
	// 뒤에 블랭크를 붙이는 메소드
	public static String BlankBackword(String str, int kan)
	{
		byte[] byteArr = str.getBytes();		// 문자열 -> 바이트 배열
		
		int blankCount = kan - byteArr.length; // 총 바이트에서 남은 바이트수 계산.
		
		String blank = ""; 						// 남은 바이트수만큼 공백을 만듦.
		for(int i = 1; i <= blankCount; i++)
		{
			blank = blank + " ";
		}
		
		return str = str + blank; 				// 기존문자 + 공백 반환.
	}
	
	// 한글 숫자 세는 메소드
	public static int Count(String str)
	{
		int hanCount = 0;
		for(int i = 0; i < str.length(); i++) // 첫번째 문자부터 마지막 문자까지
		{
			byte[] charByte = str.substring(i, i+1).getBytes(); // 문자 -> 바이트 배열
			if(charByte.length == 2)							// 문자의 바이트가 2이면 
			{
				hanCount++;										// hanCount를 올린다.
			}
		}
		
		return hanCount;
	}
	
	
	
	
	
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
		
		System.out.printf("%s", BlankForeword("한글abcd", 15));
		
	}

}


