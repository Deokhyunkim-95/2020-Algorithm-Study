package boj_DP;

import java.util.Scanner;

public class Main1003_�Ǻ���ġ {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//testcase�� ���� T
		int T = sc.nextInt();		
		
		for (int i=0; i<T; i++) {
			
			//n = ���� ���� ��
			int n = sc.nextInt();
			
			//2���� �迭
			int[][] arr = new int[n+1][2];
			//					 [n+1] 	  : 3 ������ 0,1,2,3���� �� ���ƾ��ϴϱ�
			//						  [2] : 0, 1 ���� count���ٰŴ�
			
			//n=0 �� ��
			if(n==0) {
				System.out.println("1 0");
				continue;
			}
			//n=1 �� ��
			if(n==1) {
				System.out.println("0 1");
				continue;
			}

			/*
			 * ex)
			 * 		f(2) = f(1)+f(0)
			 * 			 = 1 + 0		<-- ���⼭ 1�̶� 0 �ѹ��� �Ͼ �Ŵϱ� count���ַ��� f(1)�̶� f(0)�� �� �־������
			 */
			arr[0][0] = 1;
			arr[1][1] = 1;
			
			// ���� f(2)���� �Ǻ���ġ��� ������
			// f(n) = f(n-1)+f(n-2)
			for (int j=2; j<=n; j++) {
				arr[j][0] = arr[j-1][0] + arr[j-2][0];
				arr[j][1] = arr[j-1][1] + arr[j-2][1];
			}
			
			System.out.println(arr[n][0]+" "+arr[n][1]);
			
		}
		sc.close();
	}
}
