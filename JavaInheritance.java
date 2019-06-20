/*
 * Java�̳�
 * �̳о�������̳и������������Ϊ��ʹ���������ʵ�������и����ʵ���ͷ�����������Ӹ���̳з�����ʹ��������и�����ͬ����Ϊ��
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
 * ���Animal��Ϳ�����Ϊһ�����࣬Ȼ��������������̳������֮�󣬾;��и��൱�е����Ժͷ�����
 * ����Ͳ�������ظ��Ĵ��룬ά����Ҳ��ߣ�����Ҳ���Ӽ�࣬��ߴ���ĸ�����
 * ����������Ҫ�ǿ��Զ��ʹ�ã������ٶ��дͬ���Ĵ��룩 �̳�֮��Ĵ��룺
 * */

class Animal{
	private String name;
	private int id;
	public Animal(String myName, int myid) {
		name = myName;
		id = myid;
	}
	public void eat() {
		System.out.println(name+"���ڳ�");
	}
	public void sleep() {
		System.out.println(name+"����ˮ");
	}
	public void introduction() { 
        System.out.println("��Һã�����"         + id + "��" + name + "."); 
    } 
}

class Penguin extends Animal{
	public Penguin(String myName, int myid) {
		super(myName,myid); //��Ϊ��������ʽ�Ĺ��캯����������Ҫʹ��super�ؼ��ֵ��ø������ʽ���캯��
	}
}

class Mouse extends Animal{
	public Mouse(String myName, int myid) {
		super(myName,myid);
	}
}

//��Ҫע����� Java ��֧�ֶ�̳У���֧�ֶ��ؼ̳С�
/*
 * �̳е�����
 * ����ӵ�и���� private �����ԡ�������
 * �������ӵ���Լ������Ժͷ�������������ԶԸ��������չ��
 * ����������Լ��ķ�ʽʵ�ָ���ķ�����
 * Java �ļ̳��ǵ��̳У����ǿ��Զ��ؼ̳У����̳о���һ������ֻ�ܼ̳�һ�����࣬���ؼ̳о��ǣ�
 * 		���� A ��̳� B �࣬B ��̳� C �࣬���԰��չ�ϵ���� C ���� B ��ĸ��࣬B ���� A ��ĸ��࣬
 * 		���� Java �̳������� C++ �̳е�һ�����ԡ�
 * �������֮�������ԣ��̳е�ȱ�㣬��϶ȸ߾ͻ���ɴ���֮�����ϵԽ���ܣ����������Խ���
 * 
 * �̳йؼ���
 * �̳п���ʹ�� extends �� implements �������ؼ�����ʵ�ּ̳У��������е��඼�Ǽ̳��� java.lang.Object
 * 
 * extends�ؼ���:
 * �� Java �У���ļ̳��ǵ�һ�̳У�Ҳ����˵��һ������ֻ��ӵ��һ�����࣬���� extends ֻ�ܼ̳�һ���ࡣ
 * 
 * implements�ؼ���:
 * ʹ�� implements �ؼ��ֿ��Ա����ʹjava���ж�̳е����ԣ�ʹ�÷�ΧΪ��̳нӿڵ������
 * 		����ͬʱ�̳ж���ӿڣ��ӿڸ��ӿ�֮����ö��ŷָ�����
 * 
 * super �� this �ؼ���:
 * super�ؼ��֣����ǿ���ͨ��super�ؼ�����ʵ�ֶԸ����Ա�ķ��ʣ��������õ�ǰ����ĸ��ࡣ
 * this�ؼ��֣�ָ���Լ������á�
 * 
 * final�ؼ��֣�
 * final �ؼ�����������԰��ඨ��Ϊ���ܼ̳еģ��������ࣻ�����������η������÷������ܱ�������д��
 * �����ࣺfinal class ���� {//����}
 * �������������η�(public/private/default/protected) final ����ֵ���� ������(){//������}
 * 
 * 
 * */

