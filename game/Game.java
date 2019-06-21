package game;

import java.util.Scanner;

public class Game {
	public void start() {
		Computer c = new Computer();
		Player p = new Player();
		Scanner input = new Scanner(System.in);
		
		System.out.println("欢迎来到游戏的世界");
		System.out.println("****************");
		System.out.println("猜拳开始");
		System.out.println("****************");
		System.out.println("");
		System.out.println("出拳规则：1、石头、2、剪刀、3、布");
		c.setName();
		p.setName();

		System.out.println(c.name + "VS" + p.name + "对战");
		System.out.println("是否要开始吗？");
		String answer = input.next();
		System.out.println();
		//对战次数
		int ci = 0;
		
		while(answer.equals("y")) {
			ci ++;
			int pQuan = p.chu();
			int cQuan = c.chu();
			if((pQuan==1 && cQuan==2)||(pQuan==2 && cQuan==3)||(pQuan==3 && cQuan==1)) {
				System.out.println(p.name+ "赢了");
				p.score ++;
			}else if(pQuan == cQuan) {
				System.out.println("平局");
			}else {
				System.out.println(c.name + "赢了");
				c.score ++;
			}
			System.out.println("是否开始下一轮？");
			answer = input.next();			
		}
		System.out.println("--------------------");
		System.out.println(p.name+"VS"+c.name);
		System.out.println("对战次数："+ ci);
		System.out.println();
		System.out.println("姓名\t得分");
		System.out.println(p.name + "\t" + p.score);
		System.out.println(c.name + "\t" + c.score);
		
	}

}
