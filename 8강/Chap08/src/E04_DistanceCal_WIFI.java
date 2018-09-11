// 날짜 : 5월 17일 
// 저자 : 송태양
// 제목 : 4. 거리 계산(와이파이)
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class E04_DistanceCal_WIFI {
	
	// 배열에서 최대값의 인덱스 구하기
	public static int maxIndex(ArrayList<Double> Arr)
	{
		
		int iMaxPt = 0;			// 처음 위치
		double iMax = Arr.get(0);	// 처음 배열값
				
		for(int i = 0; i < Arr.size(); i++)	// 모든 원소에 대하여
		{
			if(Arr.get(i) != null)
			{
				if(iMax < Arr.get(i))				// iMax의 기존값보다 해당 원소값이 크면
				{
					iMaxPt = i;						// iMaxPt의 기존의 위치를 해당 위치로 바꿈
					iMax = Arr.get(i);				// iMax의 기존값을 해당 원소값으로 바꿈
				}
			}
			
		}
		return iMaxPt;
	}
	
	// 배열에서 최소값의 인덱스 구하기
	public static int minIndex(ArrayList<Double> Arr)
	{
		// Min 찾기
		int iMinPt = 0;			// 처음 위치
		double iMin = Arr.get(0);	// 처음 배열값
				
		for(int i = 0; i < Arr.size(); i++)	// 모든 원소에 대하여
		{
			if(Arr.get(i) != null)
			{
				if(iMin > Arr.get(i))				// iMin의 기존값보다 해당 원소값이 작으면
				{
					iMinPt = i;						// iMinPt의 기존의 위치를 해당 위치로 바꿈
					iMin = Arr.get(i);				// iMin의 기존값을 해당 원소값로 바꿈
				}
			}
		}
		return iMinPt;
	}
	
	// 인쇄 메소드
	public static void print(int index, String Line)
	{
		String[] field = Line.split("\t");
		System.out.printf("**[%d번째 항목]******************\n", index + 2);
		System.out.printf("%s : %s\n", "소재지도로명주소", field[8]);	// 도로명주소
		System.out.printf("%s : %s\n", "위도", field[12]);	// 해당 위도
		System.out.printf("%s : %s\n", "경도", field[13]);	// 해당 경도
		
		// 융기원 위도, 경도 
		double lat = 37.3860521;
		double lng = 127.1214038;
		// 해당 위도 경도
		double lat2 = Double.parseDouble(field[12]);
		double lng2 = Double.parseDouble(field[13]);
		// 거리 계산
		double dist = Math.sqrt(Math.pow(lat2 - lat, 2) + Math.pow(lng2 - lng, 2));
		
		System.out.printf("현재지점과 거리: %f\n", dist);
		System.out.printf("*********************************\n");
	}
		
//// 메인 메소드 ////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\전국무료와이파이표준데이터.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String oneLine;
		
		// 거리 출력 /////////////////////////////////////////////////////////////////////////////
		// 한줄 읽고 없으면 빈파일, 있으면 필드 쪼갬.
		if((oneLine = br.readLine()) == null)
		{
			System.out.printf("빈 파일입니다\n");
			br.close();
			return;
		}
		String[] field_name = oneLine.split("\t");
		
						
		// 다음 줄부터 읽음.
		// 배열을 만들어 출력하고 넣음.
		ArrayList<String> LineArr = new ArrayList<String>();
		ArrayList<Double> distArr = new ArrayList<Double>();
		
		int lineCnt = 2;
		while((oneLine = br.readLine()) != null)
		{
			String[] field = oneLine.split("\t");
			// 융기원 위도, 경도 
			double lat = 37.3860521;
			double lng = 127.1214038;
			// 해당 위도 경도
			double lat2 = Double.parseDouble(field[12]);
			double lng2 = Double.parseDouble(field[13]);
			
			Double dist;
			// 거리 계산
			if((lat2 >= 33 && lat2 <= 38) && (lng2 >= 124 && lng2 <= 131))
			{ dist = Math.sqrt(Math.pow(lat2 - lat, 2) + Math.pow(lng2 - lng, 2)); }
			
			else
			{ dist = null; }
		
			LineArr.add(oneLine);	// 라인을 배열에 넣음
			distArr.add(dist);		// 거리를 배열에 넣음
			
			System.out.printf("**[%d번째 항목]******************\n", lineCnt);	// 라인
			System.out.printf("%s : %s\n", field_name[8], field[8]);			// 도로명주소
			System.out.printf("%s : %s\n", field_name[12], field[12]);			// 해당 위도
			System.out.printf("%s : %s\n", field_name[13], field[13]);			// 해당 경도
			System.out.printf("현재지점과 거리: %f\n", dist);					// 계산 거리
			System.out.printf("*********************************\n");
		
			lineCnt++;
		}
		
		// 가장 먼 곳, 가장 가까운 곳 출력 ////////////////////////////////////////////////////////
		System.out.println();
		System.out.println();
		System.out.printf("**융기원에서 가장 먼 곳**********************\n");
		print(maxIndex(distArr), LineArr.get(maxIndex(distArr)));
		System.out.printf("**융기원에서 가장 가까운 곳******************\n");
		print(minIndex(distArr), LineArr.get(minIndex(distArr)));
				
		br.close();
	}
}
