//java֧�ֵ����ֱ�������
public class Variable {
	static int allClicks = 999; //�����
	String str = "Hello World"; // ʵ������
	public void method() {
		int i = 0;  // �ֲ�����
		System.out.println("method�ڲ��ľֲ�����i��ֵΪ" + i);
	}
	
	public static void main(String[] args) {
		System.out.println("�����:" + Variable.allClicks);
		System.out.println("�������" + allClicks);
		Variable var = new Variable();
		System.out.println("ʵ��������" + var.str );
		var.method();
	}

}
