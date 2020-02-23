package boj_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main9012_��ȣ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//testcase ���� T �Է¹ޱ�
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++) {
			
			//T���� ���� ����
			Stack<Character> stack = new Stack<Character>();
			
			//������ ��ȣ�� String���� ���� ����
			String input = sc.next();
			
			//count�� �������� �Ѱ���
			int count = 0;
			
			//input�� ���̸�ŭ for�� ������ : index 0 ���� �����ϰ� ��
			for (int j=0;j<input.length(); j++) {
				
				//�� ��ȣ 1���� ��������
				char c = input.charAt(j);
				
				//���� ���� ��ȣ�� ������ �׳� push�Ѵ�
				if(c=='(') {
					stack.push(c);
				} else {
					
					//���� ��ȣ�� ������ �� stack�� ���� �ִٸ�(������ȣ�� �ִٴ� ��) pop����
					if (!stack.isEmpty()) {
						stack.pop();
					} 
					
					else {
						//stack�� empty�ϴٸ� count�� ������Ų�� (���� ��ȣ������)
						count++;
					}
				}
			}
			//�������� �����µ� ����ƶ� ���ÿ� ���� ���������� ¦�� �ȸ´°Ŵϱ� count����
			if(!stack.isEmpty()) count++;
//			System.out.println(count);

			//count�� 0 == ��ȣ ¦ �� ����
			if (count==0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}
