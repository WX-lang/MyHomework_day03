package day03;

import java.text.*;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        //现在的系统时间
        Date date = new Date();
        //输入生日时间
        System.out.println("输入生日，格式为yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        //创建日期格式化对象
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //将字符串形式的生日转化为Date型式
        Date birthday = df.parse(string);
        // 将两个日期转成毫秒值,Date类的方法getTime
        long birthdaySecond = birthday.getTime();
        long todaySecond = date.getTime();
        //相差的时间（毫秒）
        long time = todaySecond - birthdaySecond;
        //判断未出生以及已出生的人情况
        if (time < 0) {
            System.out.println("还未出生呢");
        } else {
            System.out.println(time / 1000 / 60 / 60 / 24 / 7);
        }
    }
}
