package boj_greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main1139_ATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] time = new int[N];	//�Է¹��� Pi
		int[] sum = new int[N];		//�� ������� �ɸ��� �ð�
		
		//�� �ð� �Է¹ޱ�
		for (int i=0; i<N; i++) {
			time[i] = sc.nextInt();
		}
//		System.out.println("time[] : " + Arrays.toString(time));
		
		//������������ ����
		Arrays.sort(time);
		
//		System.out.println("time sort : " + Arrays.toString(time));
				
		//0��° �ε����� ���� �״�δϱ� ����
		sum[0] = time[0];
		
		//0��°�� ���� ������ 1��°���� for�� ����
		for (int i=1; i<N; i++) {
			//����� �ɸ��� �� �ð��� ���� ����� �ð�+�� �ð�
			sum[i] = time[i]+sum[i-1];
		}
//		System.out.println("sum[] : " + Arrays.toString(sum));
		
		int total = 0;
		for (int i=0; i<N; i++) {
			total += sum[i];
		}
		System.out.println(total);

	}

}
