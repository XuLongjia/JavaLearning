/*
 * Java Scanner ��
 * java.util.Scanner �� Java5 �������������ǿ���ͨ�� Scanner ������ȡ�û������롣
 * �����Ǵ��� Scanner ����Ļ����﷨��Scanner s = new Scanner(System.in);
 * ������������ʾһ����򵥵��������룬��ͨ�� Scanner ��� next() �� nextLine() ������ȡ������ַ�����
 * 			�ڶ�ȡǰ����һ����Ҫ ʹ�� hasNext �� hasNextLine �ж��Ƿ�����������ݣ�
 * 
 * 
 * */
import java.util.Scanner;

public class JavaScaner {
	public static void main(String[] args) {
		//scanerDemo();
		//scanerDemo2();
		scannerAverage();
	}
	
	public static void scanerDemo() {
		Scanner scan = new Scanner(System.in);
		//�Ӽ��̽�������
		
		//next�ķ�ʽ�����ַ���
		System.out.println("next��ʽ���գ�");
		//�ж��Ƿ�������
		if (scan.hasNext()) {
			String str1 = scan.next();
			System.out.println("���������Ϊ��" + str1);
		}
		scan.close();
	}
	
	public static void scanerDemo2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nextline��ʽ���գ�");
		if(scan.hasNextLine()) {
			String str2 = scan.nextLine();
			System.out.println("���������Ϊ��" + str2);
		}
		scan.close();
	}
	
	//���·������ǿ������������֣��������ܺ���ƽ������ÿ����һ�������ûس�ȷ�ϣ�ͨ��������������������벢���ִ�н����
	public static void scannerAverage() {
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		while (scan.hasNextDouble()) {  //�����Ҫ����һ��end��Ϊ������
			double x = scan.nextDouble();
			m +=1;
			sum +=x;
		}
		System.out.println(m + "�����ĺ�Ϊ" + sum);
		System.out.println(m + "������ƽ��ֵ��" + (sum / m));
		scan.close();
		
	}

}
