import java.io.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee empOne = new Employee("RUNOBB1");
		Employee empTwo = new Employee("RUNOBB2");
		
		empOne.empAge(29);
		empOne.empDesignation("�߼�����Ա");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("�������Ա");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}
	
}
