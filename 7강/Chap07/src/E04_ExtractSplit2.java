// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 4. ������ �ʵ� ���� 2
public class E04_ExtractSplit2 {
	
	public static String sNumRead(String sNum) 
	{
			String sNumRead = "";	// �б⸦ �����Ͽ� �ۼ���.
						
			String[] readNum = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"}; // ���� �б�
			String[] readUnit= {"",   "��", "��", "õ", "��", "��", "��", "õ", "��", "��"}; // ���� �б�
			
			// �ε��� �ʱⰪ.
			int index, readUnitIndex; 
			index = 0;						// ��������� ��ġ -> ���ڿ����� ���� �������� & ���� �б� �������� 
			readUnitIndex = sNum.length()-1;// �Ųٷ��� ��ġ(�ڸ���-1 -> �迭�� �ε����� ���߱� ����) -> �ش� ��ġ�� ���� �б� ��������.
			
			
			while(true) {
				
				// Ż�� ���ǽ�
				if(index >= sNum.length()) // �ڸ����� �Ѿ�� ����.
				{ 
					break; 
				}
				
				// �ش� ��ġ�� ���ڰ� "0"�� ��
				if(sNum.substring(index,index+1).equals("0")) 
				{ 
					// �ش� ��ġ�� ���� �б� �������Ⱑ "��"�̳� "��"�� �� 
					if(readUnit[readUnitIndex].equals("��") || readUnit[readUnitIndex].equals("��")) 
					{ 
						if (sNum.length() > 8 && readUnit[readUnitIndex].equals("��") && sNum.substring(index-3, index+1).equals("0000")) {
							
						} else {
							sNumRead = sNumRead + readUnit[readUnitIndex];
						}
						// �б� = �б� + �����б� ��������	
					}
					// "��"�̳� "��"�� �ƴϸ�
					else 
					{ // �ƹ��͵� ����.(�����б�x, �����б�x)
					}
				} 
				// �ش� ��ġ�� ���ڰ� "0"�� �ƴ� ��
				else
				{
					sNumRead = sNumRead // �б� = �б� + �����б� �������� + ���� �б� ��������
							+ readNum[Integer.parseInt(sNum.substring(index,index+1))]
							+ readUnit[readUnitIndex];
				}
				// ������
				// ��ġ�� ��ĭ �ű��.(�����б� ��ġ�� ++, �����б� ��ġ�� --)
				index++; readUnitIndex--;
			}
			// ��ġ�� �ڸ����� ����� ������ �б⸦ ����Ѵ�.
			
			return sNumRead;
	}
	
		
	public static void main(String[] args) {
		
		String[] data = 
		{
				"��  ��,�Ϲ���,���,û�ҳ�,��  Ÿ",
				"����,4650852,33687,302942,438487",
				"�λ�,887382,7605,78249,100000000",
				"�뱸,412557,6826,88361,4891",
				"��õ,732950,7407,89892,47337",
				"����,195723,2154,36617,3934",
				"����,226276,3339,33324,67",
				"���,131883,1388,23391,117",
				"����,8381,127,1143,21",
				"���,3058839,25172,311296,181143",
				"����,76747,1374,17349,583",
				"���,117505,829,20523,0",
				"�泲,111603,1740,29569,3",
				"����,90102,729,16710,0",
				"����,193230,3312,46166,13",
				"���,133707,3367,34359,949",
				"�泲,209266,2643,45865,0",
				"����,37889,2702,13087,60"
		};
		
		System.out.println(sNumRead("1000000000"));
		
		System.out.printf("���߱��� �̿��������� �̿��ο�(2014)\n");
		
		// ù��° ���ڿ�(�ʵ��) ,�� ������ ���ڿ� �迭 ����.
		String[] field_name = data[0].split(",");
				
		// ������ ���ڿ�(������)
		for(int i = 1; i < data.length; i++)
		{
			String[] field = data[i].split(",");							// �ش� ���ڿ��� ,�� ������ ���ڿ� �迭�� ����.
			System.out.printf("************************************\n");	
			for(int j = 0; j < field_name.length; j++)						// ó�� �ʵ���� ������ �ʵ����.
			{
				if(j == 0)
				{ 
					System.out.printf(" %s : %s\n", field_name[j], field[j] );  // �ʵ��(ù��°���ڿ�)�� �ʵ�(�ش� ���ڿ�)�� ���.
				}
				else
				{ 
					System.out.printf(" %s : %s\n", field_name[j], sNumRead(field[j]));
				}
			}
			System.out.printf("************************************\n");
		}
		
	}
}
