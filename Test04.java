package day03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        System.out.println("输入保质期的天数");
        //获取保质期
        int baoDay = new Scanner(System.in).nextInt();
        System.out.println("输入一个产品的生产日期，格式为yyyy-MM-dd");
        //获取生产日期
        String creatString = new Scanner(System.in).nextLine();
        ////创建日期格式化对象
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //将字符串形式的生产日期转化为Date型式
        Date creatDate = dateFormat.parse(creatString);
        //创建日历
        Calendar calendar = Calendar.getInstance();
        //将Date型式的生产日期转化为Calendar型式
        calendar.setTime(creatDate);
        //该商品过期日前2周
        calendar.add(Calendar.DATE,baoDay - 7*2);
        //跳转到该周的星期三
        calendar.set(Calendar.DAY_OF_WEEK,4);
        System.out.println(calendar.getTime());
        /*calendar.add(Calendar.DATE,baoDay);
        calendar.add(Calendar.WEEK_OF_MONTH,- 2);
        calendar.set(Calendar.DAY_OF_WEEK,4);
        System.out.println(calendar.getTime());*/
    }
}
