/*
 * 实例变量：
 * 1、实例变量声明在一个类中，但在方法、构造方法和语句块中；
 * 2、当一个对象被实例化后，每个实例变量的值就跟着确定；
 * 3、实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
 * 4、访问修饰符可以修饰实例变量
 * 5、实例变量对于类中的方法、构造方法或者语句块是可见的、一般情况下应该把实例变量设为私有
 * 6、实例变量具有默认值
 * 7、实例变量可以直接通过变量名访问。
 * */
import java.io.*;
public class ObjectVariable {
	//这个实例变量对子类可见
	public String name;
	//私有变量，仅在该类可见
	private double salary;
	//在构造器中对name赋值
	public ObjectVariable(String empName) {
		name = empName;
	}
	//设定salary的值
	public void setSalary(double empSal){
	   salary = empSal;
	}  
	   // 打印信息
	public void printEmp(){
	   System.out.println("名字 : " + name );
	   System.out.println("薪水 : " + salary);
	}
	public static void main(String[] args){
	   ObjectVariable empOne = new ObjectVariable("RUNOOB");
	   empOne.setSalary(1000);
	   empOne.printEmp();
	}
}
