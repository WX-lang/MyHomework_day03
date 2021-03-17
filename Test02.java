package day03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //获取当前系统时间
        Date date = new Date();
        //创建日期格式化对象,在获取格式化对象时可以指定风格
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将Date对象格式化为字符串
        String str = format1.format(date);
        System.out.println(str);
    }
}
