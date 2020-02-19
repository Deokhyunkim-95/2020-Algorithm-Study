package Day07_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1541 {

	public static void main(String[] args) throws IOException {
		//��ȣ ����(����� ���� ������!!)
		//'-'��ȣ�� �������� ��ȣ�� ����� ���� -�� ������������ ��� +��ȣ�� -�������� �ٲٱ�!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//1. - �� ������ �迭�� ���
		String [] arr1 = br.readLine().split("\\-");
		//System.out.println(Arrays.deepToString(arr1));
		
		//3. ���� ����� ������� middle (�߰����)
		int middle[] = new int[arr1.length];
		
		//2. + �� ������ �迭�� ���� ������ ���ϱ�
		for(int i =0;i<arr1.length;i++) {
			String[] arr2 = arr1[i].split("\\+");
			int sum = 0;
			for(int j=0;j<arr2.length;j++) {
				sum+=Integer.parseInt(arr2[j]);
			}
			middle[i] = sum;
		}
		//4. last �� ���� ����� ������� ����
		//5. last�� ù���� ���� ������ ���, �� ���� ������ middle (�Ʊ� ���� ����)�� ������ �ٲپ ���!
		int last = middle[0];
	
		for(int i=1; i<arr1.length;i++) {
			last -= middle[i];
		}
		System.out.println(last);
		//Ȥ�� ���� �ӵ� ������ ���..(��¯�� �ð� �ʰ� ���뼭 buffer�� ���� ������)
		br.close();
	}

}
