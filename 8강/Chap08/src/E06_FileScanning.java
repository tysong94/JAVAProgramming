// 날짜 : 5월 23일 
// 저자 : 송태양
// 제목 : 6. 파일 훑어보기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E06_FileScanning {
	public static void main(String[] args) throws IOException {
		
		// 파일 변수, 파일 읽기 변수, 한줄 저장 변수 생성
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f));
		StringBuffer sb = new StringBuffer();
		
		// 총 읽을 글자수, 읽어온 글자수 변수 생성
		int lineCnt = 0;
		char[] ch = new char[1000]; // 한번에 1000개를 읽음.
		int n = -1;					 // 읽어온 글자수.
				
		// 글자 읽기
		while(true) {
			n = br.read(ch);			// 글자를 읽어 배열에 넣음, n은 읽어온 글자수
			if(n == -1) { break; }		// 글자가 없으몀 멈춤.
			
			for(char c : ch) {										// 1000글자(이하)에서 한 글자씩 가져옴.
				
				if(c != '\n') {										// 개행이 아니면 
					sb.append(c);									// sb(스트링버퍼)에 글자를 누적한다.
				}
				else {												// 개행이면 
					System.out.printf("[%s]***\n", sb.toString());	// sb를 string으로 바꾸어 출력하고 개행.
					sb.delete(0, sb.length());						// sb를 비워준다.
				}
			}
			if(lineCnt == 0) break;
			lineCnt++;
		}
		System.out.printf("[%s]***\n", sb.toString());				// 마지막 남아있는 sb를 string으로 바꾸고 출력해줌.
		br.close();		
	}
}
