// 날짜 : 5월 17일 
// 저자 : 송태양
// 제목 : 3. 실제 파일에 응용
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class E03_ApplyToRealFile_WIFI {
	
	public static void main(String[] args) throws IOException 
	{
		// 파일 변수, 파일 읽기 변수, 라인 저장 변수 정의
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\전국무료와이파이표준데이터.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String oneLine;
		
		// 필드명 라인(첫번째 라인) 쪼개기
		if((oneLine = br.readLine()) == null)		// 필드명 라인이 없으면(빈 파일이면) 
		{
			System.out.printf("빈 파일입니다\n");	// 빈파일이라고 출력.
			br.close();								// 파일 닫음.
			return;
		}
		String[] field_name = oneLine.split(",");	// 첫번째 라인을 ,로 나누고 필드명 배열에 넣어준다.
		
		// 내용 라인(두번째 라인~) 쪼개어 출력하기.
		int lineCnt = 1;							// 라인수를 저장할 변수 정의
		while((oneLine = br.readLine()) != null)	// 한 라인을 읽고 저장, 빈라인이 아니면 계속 시행함.
		{
			String[] field = oneLine.split(",");								// 한 라인을 ,로 나누고 필드 배열에 넣어준다.
			
			System.out.printf("**[%d번째 항목]******************\n", lineCnt);	
			for(int j = 0; j < field_name.length; j++)
			{
				System.out.printf("%s : %s\n", field_name[j], field[j]);		// 한 라인의 필드명과 필드를 모두 출력
			}
			System.out.printf("*********************************\n");
			
			if(lineCnt == 100) break;											// 총 100라인이 되면 멈춤. 			
			lineCnt++;															// 라인수를 올려줌.
		}
		br.close();																// 파일 닫음.
	}
}
