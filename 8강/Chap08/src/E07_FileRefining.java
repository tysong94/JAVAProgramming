// 날짜 : 5월 23일 
// 저자 : 송태양
// 제목 : 7. 파일 정제하기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E07_FileRefining {
	public static void main(String[] args) throws IOException {
		
		// 기존 파일 변수, 기존 파일 읽기 변수, 새로운 파일 변수, 새로운 파일 쓰기 변수, 한줄 저장 변수 생성
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File f1 = new File("C:\\Users\\kopo\\Desktop\\Data\\StockDailyPrice.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
		
		String oneLine;
		
		
		// 라인 읽기, 정제하기, 다시 쓰기
		int rcnt = 0; int wcnt = 0;
		while((oneLine = br.readLine()) != null) {
			StringBuffer sb = new StringBuffer();
			
			String[] field = oneLine.split("%_%");
			if(field.length > 2 && field[2].replace("^", "").trim().substring(0, 1).equals("A")) {	// 정제한 2번 필드의 첫글자가 A일 때
				
				sb.append(field[0].replace("^", "").trim());			// 정제한 0번 필드를 sb에 누적. 
				for(int j = 1; j < field.length; j++) {					// 1번 필드부터 마지막 필드까지
					sb.append("," + field[j].replace("^", "").trim());	// ,와 정제한 필드를 sb에 누적함.
				}
				
				bw1.write(sb.toString()); bw1.newLine();// 새로운 파일에 누적한 sb를 string으로 바꾸고 쓰고 개행함. 
				wcnt++;									// 쓴 라인 수 카운트	
				System.out.printf("write [%d][%d][%s]\n", rcnt, wcnt, sb.toString());
			}
			rcnt++;										// 읽은 라인 수 카운트
		}
		br.close();
		bw1.close();
			
		System.out.printf("Program End[%d][%d]records\n",rcnt, wcnt);
	}
}
