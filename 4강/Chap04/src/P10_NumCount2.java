// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : ���� �б�2
public class P10_NumCount2 {
	public static void main(String[] args) {
		
		int iNum_k08 = 1000004567; 

		String sNum_k08 = String.valueOf(iNum_k08); // ���ڿ� ����
		String sNumVoice_k08 = ""; // �б⸦ �����Ͽ� �ۼ���.
		System.out.printf("==> %s[%d�ڸ�]\n", sNum_k08, sNum_k08.length()); //���ڰ� ���ڸ����� ���.
		
		String[] units_k08= {"��","��","��","��","��","��","��","ĥ","��","��"}; // ���� �б�
		String[] unitx_k08= {"","��","��","õ","��","��","��","õ","��","��"}; // ���� �б�
		
		// �ʱⰪ 
		int num_k08, digit_k08; 
		num_k08 = 0; // ��������� ��ġ -> ���ڿ����� ���� �������� & ���� �б� �������� 
		digit_k08 = sNum_k08.length()-1; // �Ųٷ��� ��ġ(�ڸ���-1 -> �迭�� �ε����� ���߱� ����) -> �ش� ��ġ�� ���� �б� ��������.
		
		while(true) {
			
			// Ż�� ���ǽ�
			if(num_k08 >= sNum_k08.length()) { break; } // ��ġ�� �ڸ����� �Ѿ�� ����.(��ġ�� �迭�� �ε����̹Ƿ� '0 ~ �ڸ���-1' ���� �ؾ��Ѵ�.)
			
			// �ش� ��ġ�� ���ڿ� ���� �б⸦ ���.
			System.out.printf("%s[%s]", 
					sNum_k08.substring(num_k08, num_k08+1), // ���ڿ� ���ڿ��� �ش� ��ġ�� ���ڸ� ������. 
					units_k08[Integer.parseInt(sNum_k08.substring(num_k08,num_k08+1))]); // �迭���� �ش� ��ġ�� �����б⸦ ������.
						
			// �ش� ��ġ�� ���ڰ� "0"�� ��
			if(sNum_k08.substring(num_k08,num_k08+1).equals("0")) 
			{ 
				// �ش� ��ġ�� ���� �б� �������Ⱑ "��"�̳� "��"�� �� 
				if(unitx_k08[digit_k08].equals("��") || unitx_k08[digit_k08].equals("��")) 
				{ 
					if(unitx_k08[digit_k08].equals("��") // �ش� ��ġ�� �����бⰡ "��"�̰�
							&& sNum_k08.substring(num_k08-3,num_k08+1).equals("0000")) // �� ���� �ڸ����� �� 0�̸� 
					{ // �ƹ��͵� ���Ѵ�.(��� 0�̸� ������ ������� ����)
					}
					else 
					{
						sNumVoice_k08 = sNumVoice_k08 + unitx_k08[digit_k08]; // �б� = �б� + �����б� ��������	
					}
				}
				// "��"�̳� "��"�� �ƴϸ�
				else 
				{ // �ƹ��͵� ����.(�����б�x, �����б�x)
				}
			} 
			// �ش� ��ġ�� ���ڰ� "0"�� �ƴ� ��
			else
			{
				sNumVoice_k08 = sNumVoice_k08 // �б� = �б� + �����б� �������� + ���� �б� ��������
						+ units_k08[Integer.parseInt(sNum_k08.substring(num_k08,num_k08+1))]
						+ unitx_k08[digit_k08];
			}
			// ������
			// ��ġ�� ��ĭ �ű��.(�����б� ��ġ�� ++, �����б� ��ġ�� --)
			num_k08++; digit_k08--;
		}
		// ��ġ�� �ڸ����� ����� ������ �б⸦ ����Ѵ�.
		System.out.printf("\n%s[%s]\n", sNum_k08, sNumVoice_k08); // '���ڿ� ����'�� '[�б�]'�� �����.
			
	}
}
