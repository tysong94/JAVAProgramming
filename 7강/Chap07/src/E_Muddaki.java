import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class E_Muddaki {
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("C:\\Users\\kopo\\Desktop\\Data\\a.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		String str = "";
		while(!(str = br.readLine()).startsWith("s")) {
			sb.append(str + "\n");
		}
		
		br.close();
		fw.write(sb.toString());
		fw.flush();
		fw.close();
		System.out.println("저장이 완료되었습니다.");
			
	}
}
