/*
 * Java�ֲ�������
 * 1���ֲ����������ڷ��������췽������������
 * 2���ֲ������ڷ��������췽�����������鱻ִ�е�ʱ�򴴽���������ִ����ɺ󡢱��������Զ�����
 * 3���������η��������ھֲ�����
 * 4���ֲ�����ֻ���������ķ��������췽�����������пɼ���
 * 5���ֲ���������ջ�Ϸ���ġ�
 * 6���ֲ�����û��Ĭ��ֵ�����оֲ������������󣬱��뾭����ʼ�����ſ���ʹ��
 * */
public class LocalVariable {
	public void pupAge() {
		int age = 0;
		age = age+5;
		System.out.println("С���������ǣ�" + age);
	}
	
	public static void main(String[] args) {
		LocalVariable var = new LocalVariable();
		var.pupAge();	
	}
}
