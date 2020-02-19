package Day07_Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		//BOJ sort(11651 ����)
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) return Integer.compare(o1[0], o2[0]);
				return Integer.compare(o1[1], o2[1]);
			}
		});
		//ó���� end �� arr[0][1]�� �ΰ� �ؼ� Ʋ�ȴ�.
		//count�� 1�� �̸� ������ �ڿ� �ؼ� ������� count =4�� ����� ����� ������, BOJä���� Ʋ����  �̺κ��� Ȯ���ؼ� Ǯ��.
		//end�� ��츦 �ƿ� -1�� ������ �ڿ� count�� �������ѳ����� ����� �´ٰ�..��... �׷���..
		//�ֳ��ϸ� ���� ��ʴ� 1,4 ���� ����������, �� ���� �ε������� ���� �� �� �� ���ڳ�? �׷��ϱ� �̷��� ���°� �°ڱ�..
		
		int count =0;
		int end = -1;
		
		for(int i=0;i<n;i++) {
			if(end<=arr[i][0]) {
				count++;
				end = arr[i][1];
			}
		}
		System.out.println(count);
	}
}
