// 날짜 : 5월 17일 
// 저자 : 송태양
// 제목 : 1. 무식하게 읽고 쓰기
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class E01_SimpleRW {
	public static void main(String[] args) {
		
		try 
		{
			// 파일을 가져와 파일 변수에 넣음
			File f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");
			
			// 파일 쓰기
			FileWriter fw = new FileWriter(f);	// 파일 쓰기 변수 생성
			
			fw.write("안녕\r\n");				// 파일 쓰기
			fw.write("hello\r\n");				
			
			fw.close();							// 파일 닫기
			
			
			// 파일 읽기
			FileReader fr = new FileReader(f);		// 파일 읽기 변수 생성
			
			char[] ch = new char[100];				// 최대 읽을 수 있는 글자수 지정.
			int n = -1;								// 읽어온 문자 개수 : -1은 글자가 없을 때의 값.
			
			while(true)						 	
			{
				n = fr.read(ch);					// ch 배열에 한 글자씩 저장, n에 총 읽어온 글자수를 저장.
				if(n == -1) break;					// 읽어온 글자가 없으면 멈춘다.
				for(int i = 0; i < n; i++)			// 읽어온 글자수만큼
				{
					System.out.printf("%c", ch[i]);	// ch 배열에서 글자를 가져옴.
				}
			}
			
			fr.close();								// 파일 닫기
			System.out.printf("\nFILE READ END");
		}
		catch(Exception e)
		{
			System.out.printf("에러입니다.[%s]", e);
		}
		
	}
}
