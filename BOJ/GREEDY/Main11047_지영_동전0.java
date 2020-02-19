package boj_greedy;

import java.util.Scanner;

public class Main11047_����0 {

	public static void main(String[] args) {
		
		/*
		 * 1. ���� ū ���� K�� ���ؼ� K�� �� ũ�� ����
		 * 2. ���� ���� ������ ������ ��
		 * 3. �� �������� ���� ���� ��
		 * 
		 */
		 Scanner sc = new Scanner(System.in);
		 
		 int N = sc.nextInt();
		 int K = sc.nextInt();
		 
		 //k���� ū ������ �ʿ������ ������ �ε��� Ȯ���Ұ���
		 int maxAble = 0;
		 
		 int[] coins = new int[N];
		 
		 for (int i=0; i<N; i++) {
			 coins[i] = sc.nextInt();
			 
			 //���� K�� �������� ũ��
			 if(K >= coins[i]) 
				 //�� ������ �ε��� ŵ
				 maxAble = i;
			 
			 //�̷��� K���� ū �ֵ��� �ε����� ŵ ���ϰԵ�
		 }
		 
		 int count = 0;
		 
		 //ū �������� �����ϴϱ� �ִ� �ε������� 0���� �پ���
		 for(int i=maxAble; i>=0; i--) {
			 
			 //�־��� K���̶� ���� ������ �� ������ ������ ����
			 //i�� �پ��鼭 ����ؼ� count�� ������ ������
			 count += K / coins[i];
			 
			 //K�� �پ�����Ұžƴ�? Ư�� ���� n����ŭ �����ϸ� �׸�ŭ K�� �ٰ���
			 //�׷��� �� �������� ������ �� �������� K�� �ǰ���
			 K %= coins[i];
		 }
		 
		 System.out.println(count);

	}

}
