/*
 * ʵ��������
 * 1��ʵ������������һ�����У����ڷ��������췽���������У�
 * 2����һ������ʵ������ÿ��ʵ��������ֵ�͸���ȷ����
 * 3��ʵ�������ڶ��󴴽���ʱ�򴴽����ڶ������ٵ�ʱ�����٣�
 * 4���������η���������ʵ������
 * 5��ʵ�������������еķ��������췽�����������ǿɼ��ġ�һ�������Ӧ�ð�ʵ��������Ϊ˽��
 * 6��ʵ����������Ĭ��ֵ
 * 7��ʵ����������ֱ��ͨ�����������ʡ�
 * */
import java.io.*;
public class ObjectVariable {
	//���ʵ������������ɼ�
	public String name;
	//˽�б��������ڸ���ɼ�
	private double salary;
	//�ڹ������ж�name��ֵ
	public ObjectVariable(String empName) {
		name = empName;
	}
	//�趨salary��ֵ
	public void setSalary(double empSal){
	   salary = empSal;
	}  
	   // ��ӡ��Ϣ
	public void printEmp(){
	   System.out.println("���� : " + name );
	   System.out.println("нˮ : " + salary);
	}
	public static void main(String[] args){
	   ObjectVariable empOne = new ObjectVariable("RUNOOB");
	   empOne.setSalary(1000);
	   empOne.printEmp();
	}
}
