package boj_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10828_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//cmd ���� �Է¹޴� N
		int N = sc.nextInt();
		
		//N������ ���Ͱ� �־ �װ� �ν�������� �ȱ׷� �ؿ� ���ÿ� �����ſ� ���Ͱ� �νĵǴ���
		sc.nextLine();
		
		//System.out.println();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i=0; i<N; i++) {
			//�Է¹��� ��ɹ�
			String line = sc.nextLine();
			
			//��ɹ��� �迭�� �����Ŵ�
			String[] s = line.split(" ");
			
			//split�ϸ� 0,1 �ε��� �ΰ��� ��������? 0��° �ε����� ������ ��ɹ��̴�
			String cmd = s[0];
			
			switch (cmd) {
			case "push":
				int num = Integer.parseInt(s[1]);
				stack.push(num);
				break;
			
			case "top":
				if(stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
				break;
				
			case "size":
				System.out.println(stack.size());
				break;
			
			case "pop":
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());			
				}
				break;
			
			case "empty":
				if(stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			}

		}
	}

}
