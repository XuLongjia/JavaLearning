package game;

import java.util.Scanner;

public class Player {
	String name;
	int score;
	Scanner input = new Scanner(System.in);
	
	//��������
	public void setName() {
		System.out.print("����������������");
		name = input.next();
	}

	//��ȭ
	public int chu() {
		System.out.println("���ȭ��1��ʯͷ 2������ 3����");
		int choose = input.nextInt();
		switch(choose) {
		case 1:
			System.out.println("���ȭ��ʯͷ");
			break;
		case 2:
			System.out.println("���ȭ������");
			break;
		case 3:
			System.out.println("���ȭ����");
			break;
		
		}
		return choose;
	}

}
