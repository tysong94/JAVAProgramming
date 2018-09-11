// 날짜 : 5월 17일 
// 저자 : 송태양
// 제목 : 2. Buffered 읽고 쓰기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E02_BufferedRW {
	
	// 파일 쓰기 메소드
	public static void FileWrite() throws IOException
	{
		File f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");	// 파일 가져오기
		BufferedWriter bw = new BufferedWriter(new FileWriter(f)); // 파일 쓰기 변수 정의 
		
		bw.write("안녕 안녕");	// 파일 쓰기
		bw.newLine();			// 개행하기
		bw.write("hello hello");
		bw.newLine();
		
		bw.close();				// 파일 닫기
	}
	
	// 파일 읽기 메소드
	public static void FileRead() throws IOException
	{
		File f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");	// 파일 가져오기
		BufferedReader br = new BufferedReader(new FileReader(f));	// 파일 읽기 변수 정의
		
		String oneLine;								// 한 줄을 저장할 문자열
		while((oneLine = br.readLine()) != null)	// 한 줄을 읽고 저장함, 줄이 없으면 멈춤.
		{
			System.out.printf("%s\n", oneLine);		// 저장한 줄을 출력
		}
		
		br.close();									// 파일 닫기
	}
		
	// 메인 메소드 - 파일 읽기, 파일 쓰기 메소드 실행
	public static void main(String[] args) throws IOException
	{
		FileWrite();
		FileRead();		
	}
}
