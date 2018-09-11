// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : sin함수 그래프
public class P12_SinGraph {
	public static void main(String[] args) {
		
		double fSin_k08;
		
		for(int angle_k08 = 0; angle_k08 < 360; angle_k08++) // 0 ~ 359도까지 시행
		{
			fSin_k08 = Math.sin(angle_k08 * 3.141592 / 180); // 0도 ~ 359도 까지의 사인 함수값
			System.out.printf("%d sin ==> %f\n", angle_k08, fSin_k08); // ~도 사인 ==> 사인 함수값 출력
		}
		
		for(int angle_k08 = 0; angle_k08 < 360; angle_k08++) // 0 ~ 359도까지 시행
		{
			fSin_k08 = Math.sin(angle_k08*3.141592/180); // 0도 ~ 359도 까지의 사인 함수값 -> -1 ~ 1까지 나온다.
			
			int Space_k08 = (int)((1.0 - fSin_k08)*50); // 사인 함수값을 0 ~ 2까지로 바꾸어주고 50을 곱하여 정수형으로 바꾸면  값의 폭이 0 ~ 100으로 커진다. 
			for(int i_k08 = 0; i_k08 < Space_k08; i_k08++) System.out.printf(" "); // i가 Space인 만큼 공백을 띄워준다.
			System.out.printf("*[%f][%d]\n", fSin_k08, Space_k08); // 사인 값과 공백을 출력함. -> sin값을 좌표에서 x값으로 표시해준 값이 출력된다.
		}
		
	}
}
