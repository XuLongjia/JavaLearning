package game;

import java.util.Scanner;

public class Computer {
	String name;
	int score;
	Scanner input = new Scanner(System.in);
	
	public void setName() {
		System.out.println("������Է��Ľ�ɫ����1�������� 2������� 3������");
		int choose = input.nextInt();
		switch(choose) {
		case 1:
			name = "������";
			break;
		case 2:
			name = "�����";
			break;
		case 3:
			name = "����";
			break;
		}
	}
	public int chu() {
		//0-2֮��������
		int choose = (int) (Math.random()*3);
		switch(choose) {
		case 0:
			System.out.println(name + "��ȭ��ʯͷ");
			break;
		case 1:
			System.out.println(name + "xx��ȭ������");
			break;
		case 2:
			System.out.println(name + "xx��ȭ����");
			break;
		}
		return choose +1;
	}

}
