// �Զ�����ת��
//���͡�ʵ�͡��ַ������ݿ��Ի�����㡣�����У���ͬ���͵�������ת��Ϊͬһ���ͣ�Ȼ��������㡣
//ת���ӵͼ����߼�
// byte,short,char �� int �� long �� float �� double
/*
 * ��������ת�������������¹���
 * 1�����ܶ�boolearn���ͽ�������ת��
 * 2�����ܰѶ�������ת���ɲ������Ķ���
 * 3���ڰ������������ת��Ϊ����С������ʱ������ʹ��ǿ������ת��
 * 4��ת�������п��ܵ����������ʧ����
 * 5����������������ת����ͨ������С���õ�����������������
 * */
/**
 * @author a6752
 *
 */
public class ZiDongLeiZhuan {
	public static void main(String[] args)  {
		char c1 = 'a'; //����һ��char����
		int i1 = c1; //char�Զ�ת����Ϊint����
		System.out.println("char�Զ�����ת��Ϊint���ֵ����" + i1);
		char c2 = 'A';
		int i2 = c2;
		System.out.println("Aת��Ϊint�����ǣ�" + i2);
		int i3 = c2+1;
		System.out.println("char���ͺ�int���ͼ�����ֵ����" + i3);
	}

}
