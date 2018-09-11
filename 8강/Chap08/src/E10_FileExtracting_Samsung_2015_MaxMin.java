// 날짜 : 5월 23일 
// 저자 : 송태양
// 제목 : 10. 삼성전자 2015년 최대/최소 종가 데이터 추출하기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E10_FileExtracting_Samsung_2015_MaxMin {
	public static void main(String[] args) throws IOException{
		
		// 기존 파일 변수, 기존 파일 읽기 변수, 새로운 파일 변수, 새로운 파일 쓰기 변수, 한줄 저장 String 변수 생성
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\A005930.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File nf = new File("C:\\Users\\kopo\\Desktop\\Data\\A005930_2015_Max_Min.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(nf));
		
		String oneLine;								// 한 라인 저장할 String 변수 생성
		oneLine = br.readLine(); br.close();		// 한 라인 읽고 저장, 닫기
		String[] tempfield = oneLine.split(",");	// 한 라인을 필드로 쪼갠다.(,로)
		
		int max = Integer.parseInt(tempfield[3]);	// 종가 max 초기값
		int min = Integer.parseInt(tempfield[3]);	// 종가 min 초기값
		
		StringBuffer sbMax = new StringBuffer();	// 필드를 저장할 StringBuffer 변수 생성.		
		StringBuffer sbMin = new StringBuffer();
		
		int rcnt = 0; int wcnt = 0;
		
		br = new BufferedReader(new FileReader(f));// BufferReader 초기화.
		
		// 라인 읽기, 라인 추출하기, 라인 쓰기
		// 라인 읽기
		while((oneLine = br.readLine()) != null) {	// 한 라인을 읽고 저장.
			String[] field = oneLine.split(",");	// 한 라인을 필드로 쪼갠다.(,로)
						
			// 라인 추출하기
			if(field[1].contains("2015")) {						// 1번 필드가 2015년일 때
				
				if(max < Integer.parseInt(field[3])) {			// 3번 필드(종가)가 더 크면
				
					max = Integer.parseInt(field[3]);			// 종가를 저장
					sbMax.delete(0, sbMax.length());			// sbMax를 비움
					sbMax.append(field[0]);						// 0번 필드를 sbMax에 누적. 
					for(int j = 1; j < field.length; j++) 	{	// 1번 필드부터 마지막 필드까지 ,와 필드를 sbMax에 누적
						sbMax.append("," + field[j]);							
					}
				
				}
				if(min > Integer.parseInt(field[3])) {			// 3번 필드(종가)가 더 작으면
					
					min = Integer.parseInt(field[3]);			// 종가를 저장	
					sbMin.delete(0, sbMin.length());			// sbMin를 비움
					sbMin.append(field[0]);						// 0번 필드를 sbMin에 누적. 
					for(int j = 1; j < field.length; j++) 	{	// 1번 필드부터 마지막 필드까지 ,와 필드를 sbMin에 누적
						sbMin.append("," + field[j]);							
					}
				}
			}
			rcnt++;												// 읽은 라인 수 카운트
		}
		// 라인 쓰기
		bw.write(sbMax.toString()); bw.newLine();	// 새로운 파일에 누적한 sbMax를 string으로 바꾸고 쓰고 개행함. 
		wcnt++;
		bw.write(sbMin.toString()); bw.newLine();	// 새로운 파일에 누적한 sbMin를 string으로 바꾸고 쓰고 개행함. 
		wcnt++;										// 쓴 라인 수 카운트
		
		System.out.printf("write [%d][%d][%s]\n", rcnt, wcnt, sbMax.toString());
		System.out.printf("write [%d][%d][%s]\n", rcnt, wcnt, sbMin.toString());
				
		// 파일 닫기
		br.close();
		bw.close();
			
		System.out.printf("Program End[%d][%d]records\n",rcnt, wcnt);
		
	}
}
