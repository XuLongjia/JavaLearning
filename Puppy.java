//���췽��
//ÿ���඼�й��췽�������û����ʽ��Ϊ�ඨ�幹�췽����Java����������Ϊ�����ṩһ��Ĭ�Ϲ��췽����
//�ڴ���һ�������ʱ������Ҫ����һ�����췽�������췽�������Ʊ�������ͬ����һ��������ж�����췽����

//����ʵ�������ͷ���:
   /* ʵ�������� */
// object referenceVariable = new Constructor();
   /* �������еı��� */
// referenceVariable.variableName;
   /* �������еķ��� */
// referenceVariable.methodName();

public class Puppy{
	int puppyAge; //��Ա����
	public Puppy(String name) {
		// ��ʽ�Ķ���Puppy�����Ĺ��췽��
		System.out.println("С���������ǣ�" + name); //��仰�ڴ��������ʱ��ִ��
	}
	public void setAge( int age) {
		puppyAge = age;
	}
	public void getAge() {
		System.out.println("С��������Ϊ��" + puppyAge);
	}
	public static void main(String[] args) {
		//�������佫����һ��puppy����
		Puppy myPuppy = new Puppy(" tommy");
		//System.out.println("����ֵ��" + myPuppy.puppyAge);
		// ����setAge��������趨age
		myPuppy.setAge(2);
		//����getAge���������ȡage
		myPuppy.getAge();
		// Ҳ��������������Ա������
		System.out.println("����ֵ��" + myPuppy.puppyAge);
	}
}

//һ��Դ�ļ���ֻ����һ��public��,Դ�ļ�������Ӧ�ú�public�����������һ��
//һ��Դ�ļ������ж����public��

