//下面的命令行可以命令编译器载入java_installation/java/io路径下的所有类
import java.io.*;

//Employee类有四个成员变量：name、age、designation和salary
//该类显式声明了一个构造方法，该方法只有一个参数。
public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	public Employee(String name) {
		this.name = name;  //this.name 指的是上面成员变量的name
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
		System.out.println("名字:" + name);
		System.out.println("年龄:" + age);
		System.out.println("职位：" + designation);
		System.out.println("薪水:" + salary);
	}
}

//程序都是从main方法开始执行。为了能运行这个程序，必须包含main方法并且创建一个实例对象。
//下面给出EmployeeTest类，该类实例化2个 Employee 类的实例，并调用方法设置变量的值。
