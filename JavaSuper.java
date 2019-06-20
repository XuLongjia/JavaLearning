
/*
 * ��������
 * �����ǲ��̳и���Ĺ����������췽�����߹��캯�����ģ���ֻ�ǵ��ã���ʽ����ʽ����
 * �������Ĺ��������в����������������Ĺ���������ʽ��ͨ�� super �ؼ��ֵ��ø���Ĺ������������ʵ��Ĳ����б�
 * ������๹����û�в�������������Ĺ������в���Ҫʹ�� super �ؼ��ֵ��ø��๹������ϵͳ���Զ����ø�����޲ι�������
 */
class SuperClass{
	private int n;
	SuperClass(){
		System.out.println("SuperClass()");
	}
	SuperClass(int n){
		System.out.println("SuperClass(int n)");
		this.n = n;
	}
}
//SubClass ��̳�
class SubClass extends SuperClass{
	private int n;
	SubClass(){ //�Զ����ø�����޲���������
		System.out.println("SubClass()");
	}
	public SubClass(int n){
		super(300); //���ø����д��в����Ĺ�����
		System.out.println("SubClass(int n):" + n);
		this.n = n;
	}
	
}
//SubClas2 ��̳�
class SubClass2 extends SuperClass{
	private int n;

	SubClass2(){
		super(300);  // ���ø����д��в����Ĺ�����
		System.out.println("SubClass2");
	}  

	public SubClass2(int n){ // �Զ����ø�����޲���������
		System.out.println("SubClass2(int n):"+n);
		this.n = n;
	}
}

public class JavaSuper {
	public static void main(String args[]) {
		System.out.println("-------SubClass ��̳�-------");
		SubClass sc1 = new SubClass();
		SubClass sc2 = new SubClass(100);
		System.out.println("-------SubClass2��̳�-------");
		SubClass sc3 = new SubClass();
		SubClass sc4 = new SubClass(200);
	}

}
