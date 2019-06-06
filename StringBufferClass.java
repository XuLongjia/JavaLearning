/*
 * Java StringBuffer类和StringBuilder类
 * 当对字符串进行修改时，需要使用StringBuffer类和StringBuilder类
 * 和String类不同，StringBuffer和StringBuilder类的对象能够被多次的修改，并且不产生新的未使用对象。
 * 二者不同：StringBuilder的方法不是线程安全的，即不能同步访问
 * 但是StringBuilder有速度优势，不要求线程安全的时候，一般都使用StringBuilder
 * */
public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		System.out.println(sBuffer);
	}

}

//StringBuffer支持的方法： www.runoob.com/java/java-stringbuffer.html
//包括：append() reverse() delete() insert() replace() capacity()
// charAt() ensureCapacity() getChars() indexOf() indexOf() lastIndexOf() length()
