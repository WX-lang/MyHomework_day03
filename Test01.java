package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        //系统时间
        Calendar cal = Calendar.getInstance();
        //拿到对应的Date对象
        Date date = cal.getTime();
        System.out.println(date);
        //系统时间的3天后这一时刻的时间
        cal.add(Calendar.DAY_OF_MONTH,3);
        //拿到对应的Date对象
        Date date1 = cal.getTime();
        System.out.println(date1);
    }
}
