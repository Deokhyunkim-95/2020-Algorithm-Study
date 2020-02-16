package boj_DP;

import java.util.Scanner;

public class Main1932_���ﰢ�� {

	/*
	 * �� �ڸ��� ������ [i,j]�� ���� �����ϱ� ����
	 * 
	 * 				[1,1]
	 * 			[2,1]	[2,2]
	 * 		[3,1]	[3,2]	[3,3]
	 * 	[4,4]	[4,2]	[4,3]	[4,4]
	 * 
	 * ���� �밢������ ���� ���� ���� i�� �����ϰ� j=1
	 * ������ �밢������ ���� ���� i=j
	 * �߰��� �ִ� ������ Math.max�� ���� �� ū ���� ������ ���� �ȴ�!
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//ó���� �޴� �ﰢ���� ũ��
		int n = sc.nextInt();
		
		//2���� �迭 ����
		//ó�� �ﰢ�� ũ�� �ް� n+1�ٱ��� ���� �ﰢ�� �Է���
		int[][] list = new int[n+1][n+1];
		
		//sum �ʱⰪ
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				//�迭 ����
				list[i][j] = sc.nextInt();
				
				//���� �밢������ ���ذ��� �ֵ��� j���� 1�� �����Ǿ�����
				if (j==1) {
					list[i][j] = list[i-1][j] + list[i][j];
				}
				
				//������ �밢������ ���ذ��� �ֵ��� i==j
				else if (i==j) {
					list[i][j] = list[i-1][j-1] + list[i][j];
				}
				
				//�߰��� �ִ� �ֵ��� �� ū�� ���ؼ� ���ؾ���
				//Math.max(a,b) --> a�� b �� �� ū�� ����
				else {
					list[i][j] = Math.max(list[i-1][j-1], list[i-1][j]) + list[i][j];
				}
				
				if(list[i][j] > sum)
					sum = list[i][j];
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
