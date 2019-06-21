package game;

import java.util.Scanner;

public class Computer {
	String name;
	int score;
	Scanner input = new Scanner(System.in);
	
	public void setName() {
		System.out.println("请输入对方的角色：（1，奥特曼 2，孙悟空 3，关羽）");
		int choose = input.nextInt();
		switch(choose) {
		case 1:
			name = "奥特曼";
			break;
		case 2:
			name = "孙悟空";
			break;
		case 3:
			name = "关羽";
			break;
		}
	}
	public int chu() {
		//0-2之间的随机数
		int choose = (int) (Math.random()*3);
		switch(choose) {
		case 0:
			System.out.println(name + "出拳：石头");
			break;
		case 1:
			System.out.println(name + "xx出拳：剪刀");
			break;
		case 2:
			System.out.println(name + "xx出拳：布");
			break;
		}
		return choose +1;
	}

}
