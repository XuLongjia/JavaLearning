//构造方法
//每个类都有构造方法。如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认构造方法。
//在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。

//访问实例变量和方法:
   /* 实例化对象 */
// object referenceVariable = new Constructor();
   /* 访问类中的变量 */
// referenceVariable.variableName;
   /* 访问类中的方法 */
// referenceVariable.methodName();

public class Puppy{
	int puppyAge; //成员变量
	public Puppy(String name) {
		// 显式的定义Puppy这个类的构造方法
		System.out.println("小狗的名字是：" + name); //这句话在创建对象的时候执行
	}
	public void setAge( int age) {
		puppyAge = age;
	}
	public void getAge() {
		System.out.println("小狗的年龄为：" + puppyAge);
	}
	public static void main(String[] args) {
		//下面的语句将创建一个puppy对象
		Puppy myPuppy = new Puppy(" tommy");
		//System.out.println("变量值：" + myPuppy.puppyAge);
		// 调用setAge这个方法设定age
		myPuppy.setAge(2);
		//调用getAge这个方法获取age
		myPuppy.getAge();
		// 也可以这样方法成员变量：
		System.out.println("变量值：" + myPuppy.puppyAge);
	}
}

//一个源文件中只能有一个public类,源文件的名称应该和public类的类名保持一致
//一个源文件可以有多个非public类

