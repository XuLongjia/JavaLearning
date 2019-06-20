/*
 * Java继承
 * 继承就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例和方法，或子类从父类继承方法，使得子类具有父类相同的行为。
 * 
 * */
public class JavaInheritance {
	public static void main(String[] args) {
		Animal qq = new Animal("qq",123);
		qq.eat();
		qq.sleep();
		qq.introduction();
	}
}
/*
 * 这个Animal类就可以作为一个父类，然后企鹅类和老鼠类继承这个类之后，就具有父类当中的属性和方法，
 * 子类就不会存在重复的代码，维护性也提高，代码也更加简洁，提高代码的复用性
 * （复用性主要是可以多次使用，不用再多次写同样的代码） 继承之后的代码：
 * */

class Animal{
	private String name;
	private int id;
	public Animal(String myName, int myid) {
		name = myName;
		id = myid;
	}
	public void eat() {
		System.out.println(name+"正在吃");
	}
	public void sleep() {
		System.out.println(name+"正在水");
	}
	public void introduction() { 
        System.out.println("大家好！我是"         + id + "号" + name + "."); 
    } 
}

class Penguin extends Animal{
	public Penguin(String myName, int myid) {
		super(myName,myid); //因为父类有显式的构造函数，所以需要使用super关键字调用父类的显式构造函数
	}
}

class Mouse extends Animal{
	public Mouse(String myName, int myid) {
		super(myName,myid);
	}
}

//需要注意的是 Java 不支持多继承，但支持多重继承。
/*
 * 继承的特性
 * 子类拥有父类非 private 的属性、方法。
 * 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
 * 子类可以用自己的方式实现父类的方法。
 * Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，
 * 		例如 A 类继承 B 类，B 类继承 C 类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，
 * 		这是 Java 继承区别于 C++ 继承的一个特性。
 * 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。
 * 
 * 继承关键字
 * 继承可以使用 extends 和 implements 这两个关键字来实现继承，而且所有的类都是继承于 java.lang.Object
 * 
 * extends关键字:
 * 在 Java 中，类的继承是单一继承，也就是说，一个子类只能拥有一个父类，所以 extends 只能继承一个类。
 * 
 * implements关键字:
 * 使用 implements 关键字可以变相的使java具有多继承的特性，使用范围为类继承接口的情况，
 * 		可以同时继承多个接口（接口跟接口之间采用逗号分隔）。
 * 
 * super 与 this 关键字:
 * super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
 * this关键字：指向自己的引用。
 * 
 * final关键字：
 * final 关键字声明类可以把类定义为不能继承的，即最终类；或者用于修饰方法，该方法不能被子类重写：
 * 声明类：final class 类名 {//类体}
 * 生命方法：修饰符(public/private/default/protected) final 返回值类型 方法名(){//方法体}
 * 
 * 
 * */

