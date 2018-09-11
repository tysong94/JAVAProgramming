// 날짜 : 5월 17일 
// 저자 : 송태양
// 제목 : 5. 파일 분리, 데이터 정제
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E05_FileSeparation_WIFI {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\전국무료와이파이표준데이터.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File f1 = new File("C:\\Users\\kopo\\Desktop\\Data\\전국무료와이파이표준데이터_SKT.txt");
		File f2 = new File("C:\\Users\\kopo\\Desktop\\Data\\전국무료와이파이표준데이터_KT.txt");
		File f3 = new File("C:\\Users\\kopo\\Desktop\\Data\\전국무료와이파이표준데이터_LGU+.txt");
		BufferedWriter wsk = new BufferedWriter(new FileWriter(f1));
		BufferedWriter wkt = new BufferedWriter(new FileWriter(f2));
		BufferedWriter wlg = new BufferedWriter(new FileWriter(f3));
		
		// 한 줄을 저장하는 변수
		String oneLine;
		
		// 첫번째 라인을 읽음
		if( (oneLine = br.readLine()) == null )
		{
			System.out.printf("빈 파일입니다\n");
			br.close();
			wsk.close();
			wkt.close();
			wlg.close();
			return;
		}
		// 3개의 파일에 첫번째 라인을 쓰고 개행
		wsk.write(oneLine); wsk.newLine();
		wkt.write(oneLine); wkt.newLine();
		wlg.write(oneLine); wlg.newLine();
		
		
		
		int lineCnt = 2;
		while((oneLine = br.readLine()) != null)
		{
			String[] field = oneLine.split("\t");
			
			String tongsinsa = field[5].trim();
			
			// 서로 다른 통신사 이름을 하나의 통신사 이름으로 바꾸어주고 필드 배열에 넣어 한 라인으로 재조합.
			// 해당 통신사에 라인을 넣음.
			if(
				tongsinsa.equalsIgnoreCase("SK") 
				|| tongsinsa.equalsIgnoreCase("SKT") 
				|| tongsinsa.equalsIgnoreCase("skt") 
				|| tongsinsa.equalsIgnoreCase("SK텔레콤") 
				|| tongsinsa.equalsIgnoreCase("㈜SK텔레콤")
				) 
			{	
				field[5] = "SKT"; 
				oneLine = String.join("\t", field); 
				wsk.write(oneLine); wsk.newLine(); 
			}
			else if(
					tongsinsa.equalsIgnoreCase("KT") 
					|| tongsinsa.equalsIgnoreCase("㈜KT") 
					|| tongsinsa.equalsIgnoreCase("㈜케이티") 
					|| tongsinsa.equalsIgnoreCase("KT올레") 
					|| tongsinsa.equalsIgnoreCase("KT,U+") 
					|| tongsinsa.contains("KT")
					)
			{ 
				field[5] = "KT"; 
				oneLine = String.join("\t", field); 
				wkt.write(oneLine); wkt.newLine(); 
			}
			else if(
					tongsinsa.equalsIgnoreCase("(주)엘지유플러스") 
					|| tongsinsa.equalsIgnoreCase("lg") 
					|| tongsinsa.equalsIgnoreCase("LG") 
					|| tongsinsa.equalsIgnoreCase("LG U +") 
					|| tongsinsa.equalsIgnoreCase("LG U+") 
					|| tongsinsa.equalsIgnoreCase("LGT") 
					|| tongsinsa.equalsIgnoreCase("LGU") 
					|| tongsinsa.equalsIgnoreCase("lgu+") 
					|| tongsinsa.equalsIgnoreCase("LGU+") 
					|| tongsinsa.equalsIgnoreCase("LG유플러스") 
					|| tongsinsa.equalsIgnoreCase("U+")
					) 
			{  
				field[5] = "LGU+";
				oneLine = String.join("\t", field);
				wlg.write(oneLine); wlg.newLine();
			} 
			else { System.out.printf("알 수 없는 통신사[%d번째 항목][%s]***\n", lineCnt, field[5]); }
			
			lineCnt++;
		}
		
		br.close();
		wsk.close();
		wkt.close();
		wlg.close();
	}
}
