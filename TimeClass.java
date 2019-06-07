import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


//Java日期时间
/*
 *java.util 包提供了 Date 类来封装当前的日期和时间。 Date 类提供两个构造函数来实例化 Date 对象。
 * 第一个构造函数使用当前日期和时间来初始化对象。  Date()
 * 第二个构造函数接收一个参数，该参数是从1970年1月1日起的毫秒数。 Date(long millisec)
*/

public class TimeClass {
	public static void main(String[] args) {
	    //初始化对象
	    Date date = new Date();
		
	    //使用 toString() 函数显示日期时间
	    System.out.println("打印时间：" + date.toString());
		
	    //直接打印date等同于 date.toString()
	    System.out.println(date);
	    
	    //使用printf格式化日期: 使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。 字母包括：c F D r T R
	    System.out.println("");
	    System.out.println("------------格式化字符串：--------------------------");
	    //c的使用  
	    System.out.printf("全部日期和时间信息：%tc%n",date);          
	    //f的使用  
	    System.out.printf("年-月-日格式：%tF%n",date);  
	    //d的使用  
	    System.out.printf("月/日/年格式：%tD%n",date);  
	    //r的使用  
	    System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);  
	    //t的使用  
	    System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);  
	    //R的使用  
	    System.out.printf("HH:MM格式（24时制）：%tR%n",date);
	    System.out.println("");
		
	    //日期转换符：
	    //定义日期格式的转换符可以使日期通过指定的转换符生成新字符串。
	    System.out.println("------------日期转换符：--------------------------");
	    //b的使用，月份简称  
            String str=String.format(Locale.US,"英文月份简称：%tb",date);       
            System.out.println(str);                                                                              
            System.out.printf("本地月份简称：%tb%n",date);  
            //B的使用，月份全称  
            str=String.format(Locale.US,"英文月份全称：%tB",date);  
            System.out.println(str);  
            System.out.printf("本地月份全称：%tB%n",date);  
            //a的使用，星期简称  
            str=String.format(Locale.US,"英文星期的简称：%ta",date);  
            System.out.println(str);  
            //A的使用，星期全称  
            System.out.printf("本地星期的简称：%tA%n",date);  
            //C的使用，年前两位  
            System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n",date);  
            //y的使用，年后两位  
            System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n",date);  
            //j的使用，一年的天数  
            System.out.printf("一年中的天数（即年的第几天）：%tj%n",date);  
            //m的使用，月份  
            System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n",date);  
            //d的使用，日（二位，不够补零）  
            System.out.printf("两位数字的日（不足两位前面补0）：%td%n",date);  
            //e的使用，日（一位不补零）  
            System.out.printf("月份的日（前面不补0）：%te%n",date);  
	    
        
		//试一下其他的函数：
	    System.out.println("");
	    System.out.println("------------试一下其他的函数：--------------------------");
            System.out.println("打印毫秒：" + date.getTime());
	    System.out.println("打印Hash: " + date.hashCode());
		
            //使用 SimpleDateFormat 格式化日期
	    //SimpleDateFormat 是一个以语言环境敏感的方式来格式化和分析日期的类。SimpleDateFormat 允许你选择任何用户自定义日期时间格式来运行。例如：
	    System.out.println("");
	    Date dNow = new Date();
	    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	    System.out.println("当前时间：" + ft.format(dNow));
		
		
	}
}
