package kr.ac.kopoctc.algoritm.t4;

public class InsertBlank {
	// 뒤에 블랭크를 붙이는 메소드
	public static String BlankBackword(String str, int kan){
				
		byte[] byteArr = str.getBytes();		// 문자열 -> 바이트 배열
				
		int blankCount = kan - byteArr.length; // 총 바이트에서 남은 바이트수 계산.
			
		String blank = ""; 						// 남은 바이트수만큼 공백을 만듦.
		for(int i = 1; i <= blankCount; i++) {
			blank = blank + " ";
		}
		
		return str = str + blank; 				// 기존문자 + 공백 반환.
	}
}
