package game;

import java.util.Scanner;

public class Game {
	public void start() {
		Computer c = new Computer();
		Player p = new Player();
		Scanner input = new Scanner(System.in);
		
		System.out.println("��ӭ������Ϸ������");
		System.out.println("****************");
		System.out.println("��ȭ��ʼ");
		System.out.println("****************");
		System.out.println("");
		System.out.println("��ȭ����1��ʯͷ��2��������3����");
		c.setName();
		p.setName();

		System.out.println(c.name + "VS" + p.name + "��ս");
		System.out.println("�Ƿ�Ҫ��ʼ��");
		String answer = input.next();
		System.out.println();
		//��ս����
		int ci = 0;
		
		while(answer.equals("y")) {
			ci ++;
			int pQuan = p.chu();
			int cQuan = c.chu();
			if((pQuan==1 && cQuan==2)||(pQuan==2 && cQuan==3)||(pQuan==3 && cQuan==1)) {
				System.out.println(p.name+ "Ӯ��");
				p.score ++;
			}else if(pQuan == cQuan) {
				System.out.println("ƽ��");
			}else {
				System.out.println(c.name + "Ӯ��");
				c.score ++;
			}
			System.out.println("�Ƿ�ʼ��һ�֣�");
			answer = input.next();			
		}
		System.out.println("--------------------");
		System.out.println(p.name+"VS"+c.name);
		System.out.println("��ս������"+ ci);
		System.out.println();
		System.out.println("����\t�÷�");
		System.out.println(p.name + "\t" + p.score);
		System.out.println(c.name + "\t" + c.score);
		
	}

}
