/*
 * ���������̬������
 * �����Ҳ��Ϊ��̬�������������� static �ؼ����������������ڷ���֮�⡣
 * ����һ���ഴ���˶��ٸ�������ֻӵ���������һ�ݿ�����
 * ��̬�������˱�����Ϊ���������ʹ�á�������ָ����Ϊpublic/private��final��static���͵ı�����������ʼ���󲻿ɸı䡣
 * 
 * */
import java.io.*;
public class ClassVariable {
	//salary�Ǿ�̬��˽�б���
    private static double salary;
    // DEPARTMENT��һ������
    public static final String DEPARTMENT = "������Ա";
    public static void main(String[] args){
    	salary = 10000;
        System.out.println(DEPARTMENT+"ƽ������:"+salary);
    }
}

/*
���η������������ࡢ�����ͱ�����������ǰ��
Java�ṩ�������η����������η��ͷǷ������η�
	�������η���
		default���ࡢ�ӿڡ����������� ��ͬһ���ڿɼ���
		private������������ ��ͬһ��ɼ���
		public���ࡢ�ӿڡ����������� ��������ɼ���
		protected������������ ��ͬһ���ڵ������������ɼ���
	�Ƿ������η���
		static�������෽�����������
		final �����������ࡢ�����ͱ�����	final ���ε��಻�ܹ����̳У�
									���εķ������ܱ��̳������¶��壬
									���εı���Ϊ�������ǲ����޸ĵġ�
		abstract ����������������ͳ��󷽷���
		synchronized �� volatile �������̵߳ı��
*/