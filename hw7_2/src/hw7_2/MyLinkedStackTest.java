package hw7_2;
import java.util.Scanner;
public class MyLinkedStackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedStack stack=new MyLinkedStack();
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("hw7_2: 김윤서\n");
		do {
			System.out.println("1:삽입 2:삭제 3:조회 4:합계 5:종료");
			c=s.nextInt();
			switch(c) {
			case 1:
				try {
					System.out.print("삽입할 정수 입력:");
					int p=s.nextInt();
					stack.push(p);
				}
				catch (Exception e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 2:
				System.out.print("삭제한 정수:"+stack.pop());
				break;
			case 3:
				System.out.println("스택 최상단의 정수: "+stack.peek());
				
				break;
			case 4:
				int sum=0;
				while(!stack.isEmpty()) {
					sum+=stack.pop();
				}
				System.out.println("스택 속 정수의 합계: "+sum);
				break;
			default:
				System.out.println("잘못된 값 입력됨.");
			}
		}while(c!=5);
		/*
		 * try {
					
				}
				catch (Exception e) {
					System.out.println("스택이 비었습니다.");
				}
		 */
	}
}