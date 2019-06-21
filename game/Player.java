package game;

import java.util.Scanner;

public class Player {
	String name;
	int score;
	Scanner input = new Scanner(System.in);
	
	//设置姓名
	public void setName() {
		System.out.print("请输入您的姓名：");
		name = input.next();
	}

	//出拳
	public int chu() {
		System.out.println("请出拳（1，石头 2，剪刀 3，布");
		int choose = input.nextInt();
		switch(choose) {
		case 1:
			System.out.println("你出拳：石头");
			break;
		case 2:
			System.out.println("你出拳：剪刀");
			break;
		case 3:
			System.out.println("你出拳：布");
			break;
		
		}
		return choose;
	}

}
