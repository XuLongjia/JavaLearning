//����������п����������������java_installation/java/io·���µ�������
import java.io.*;

//Employee�����ĸ���Ա������name��age��designation��salary
//������ʽ������һ�����췽�����÷���ֻ��һ��������
public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	public Employee(String name) {
		this.name = name;  //this.name ָ���������Ա������name
	}
	
	public void empAge(int empAge) {
		age = empAge;
	}
	
	public void empDesignation(String empDesig) {
		designation = empDesig;
	}
	
	public void empSalary(double empSalary) {
		salary = empSalary;
	}
	
	public void printEmployee() {
		System.out.println("����:" + name);
		System.out.println("����:" + age);
		System.out.println("ְλ��" + designation);
		System.out.println("нˮ:" + salary);
	}
}

//�����Ǵ�main������ʼִ�С�Ϊ��������������򣬱������main�������Ҵ���һ��ʵ������
//�������EmployeeTest�࣬����ʵ����2�� Employee ���ʵ���������÷������ñ�����ֵ��
