package hw7_2;
import java.util.Scanner;
public class MyLinkedStackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedStack stack=new MyLinkedStack();
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("hw7_2: ������\n");
		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
			c=s.nextInt();
			switch(c) {
			case 1:
				try {
					System.out.print("������ ���� �Է�:");
					int p=s.nextInt();
					stack.push(p);
				}
				catch (Exception e) {
					System.out.println("������ ������ϴ�.");
				}
				break;
			case 2:
				System.out.print("������ ����:"+stack.pop());
				break;
			case 3:
				System.out.println("���� �ֻ���� ����: "+stack.peek());
				
				break;
			case 4:
				int sum=0;
				while(!stack.isEmpty()) {
					sum+=stack.pop();
				}
				System.out.println("���� �� ������ �հ�: "+sum);
				break;
			default:
				System.out.println("�߸��� �� �Էµ�.");
			}
		}while(c!=5);
		/*
		 * try {
					
				}
				catch (Exception e) {
					System.out.println("������ ������ϴ�.");
				}
		 */
	}
}