// 날짜 : 5월 23일 
// 저자 : 송태양
// 제목 : 9. 20150112 데이터 추출하기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileExtracting_20150112 {
	public static void main(String[] args) throws IOException{
		
		// 기존 파일 변수, 기존 파일 읽기 변수, 새로운 파일 변수, 새로운 파일 쓰기 변수, 한줄 저장 String 변수 생성
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File nf = new File("C:\\Users\\kopo\\Desktop\\Data\\20150112.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(nf));
		
		String oneLine;
				
		// 라인 읽기, 라인 추출하기, 라인 쓰기
		// 라인 읽기
		int rcnt = 0; int wcnt = 0;
		while((oneLine = br.readLine()) != null) {	// 한 라인을 읽고 저장.
			String[] field = oneLine.split(",");	// 한 라인을 필드로 쪼갠다.(,로)
			StringBuffer sb = new StringBuffer();	// 필드를 저장할 StringBuffer 변수 생성.					
			
			// 라인 추출하기
			if(field.length > 2 && field[1].equals("20150112")) {	// 1번 필드가 20150112일 때
				sb.append(field[0]);								// 0번 필드를 sb에 누적. 
				for(int j = 1; j < field.length; j++) {				// 1번 필드부터 마지막 필드까지 ,와 필드를 sb에 누적
					sb.append("," + field[j]);							
				}
				
			// 라인 쓰기
			bw.write(sb.toString()); bw.newLine();					// 새로운 파일에 누적한 sb를 string으로 바꾸고 쓰고 개행함. 
			wcnt++;	// 쓴 라인 수 카운트
			System.out.printf("write [%d][%d][%s]\n", rcnt, wcnt, sb.toString());															
			}
			rcnt++;	// 읽은 라인 수 카운트
		}
		// 파일 닫기
		br.close();
		bw.close();
			
		System.out.printf("Program End[%d][%d]records\n",rcnt, wcnt);
		
	}
}
