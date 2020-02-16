package boj_DP;

import java.util.Scanner;

public class Main2748_�Ǻ���ġ�� {

	public static void main(String[] args) {
			
		//1003 ������ ������ ��������� �̰� �ո� ���ϱ� ������ 1�� ī��Ʈ �ϸ� �ȴ�
		//��, 0 1 ���� ī��Ʈ �� �ʿ���� 1���� �迭���� ���� �� �ִٴ� ��
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//�Ǻ���ġ �� ����� ���� Ŀ���� ���߿��� int ������ �Ѵ���
		//�׷��� long���� �迭�� �������ϴ���
		long[] arr = new long[n+1];
		//[n+1] : 10 ������ 0~10 �� ���ƾ��ϴϱ� n+1�� ũ��� ��������

		//�Ǻ���ġ�� �� ���ϱ�����, f(0)�ϰ� f(1)���� ��� �������� ���Եȴ�
		arr[0] = 0;
		arr[1] = 1;
			
		//0,1�� ���� ������������ 2���� ����, �ִ�� �迭 ���̱��� ���� �ȴ�
		for (int j=2; j<arr.length; j++) {
			arr[j] = arr[j-1] + arr[j-2];
		}

		System.out.println(arr[n]);
		sc.close();
	}
}
