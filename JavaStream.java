import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Java 流(Stream)、文件(File)和IO
 * Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。
 * Java.io 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。
 * 一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。
 * Java 为 I/O 提供了强大的而灵活的支持，使其更广泛地应用到文件传输和网络编程中。
 * 读取控制台输入：
 * Java 的控制台输入由 System.in 完成。
 * 为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。
 * 下面是创建 BufferedReader 的基本语法：
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * BufferedReader 对象创建后，我们便可以使用 read() 方法从控制台读取一个字符，或者用 readLine() 方法读取一个字符串。
 * 
 * 从控制台读取多字符输入
 * 从 BufferedReader 对象读取一个字符要使用 read() 方法，它的语法如下：int read( ) throws IOException
 * 每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。 当流结束的时候返回 -1。该方法抛出 IOException。
 * 
 * 从控制台读取字符串
 * 从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。
 * 它的一般格式是：
 * String readLine( ) throws IOException
 * 
 * */
public class JavaStream {
	public static void main(String[] args) throws IOException {
		//bRead();
		bReadLines();
		
	}
	//下面的程序示范了用 read() 方法从控制台不断读取字符直到用户输入 "q"。
	public static void bRead() throws IOException{
		char c;
		//使用System.in 创建BufferReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下‘q'键退出。");
		//读取字符
		do {
			c = (char) br.read();   //int转换成char
			System.out.println(c);
			
		} while (c != 'q');
		
	}
	
	//下面的程序读取和显示字符行直到你输入了单词"end"。
	public static void bReadLines() throws IOException {
		// 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));		
	}

}
