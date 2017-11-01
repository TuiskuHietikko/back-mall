package com.zc.backmall.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/1.
 */
public class TimeChange {
    /**
     * 字符串时间转成Date
     * @param dateStr
     * @param format
     * @return
     */
    public static Date StringTimeToData(String dateStr,String format) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 字符串时间转时间戳
     * @param dateStr
     * @param format
     * @return
     */
    public static Long StringTimeToLong(String dateStr,String format){
        if (dateStr==null||"".equals(dateStr)){
            return null;
        }
        Date date = StringTimeToData(dateStr, format);
        return date.getTime();
    }

    /**
     * 时间戳转时间
     * @param time
     * @return
     */
    public static Date LongTimeToDate(Long time){
        return new Date(time);
    }

    /**
     * 毫秒值转时间格式
     * @param time 毫秒值
     * @param formatStr 时间格式
     * @return
     */
    public static String LongTimeToDateString(Long time,String formatStr){
        if (time==null){
            return "";
        }else {
            SimpleDateFormat format =new SimpleDateFormat(formatStr);
            return format.format(time);
        }
    }

    public static Date getNowDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
                0, 0, 0);
        Date date = calendar.getTime();
        return date;
    }

    public static void main(String[] args) throws ParseException {
        //Date date = TimeChange.StringTimeToData("2017-06-01 20:00:00", "yyyy-MM-dd HH:mm:ss");
        //Date date = LongTimeToDate(1496314429000L);
        //System.out.println(date);
        System.out.println(LongTimeToDateString(System.currentTimeMillis(),"yyyy-MM-dd HH:mm:ss"));
    }
    
    /**
     * @param date
     * @return
     */
    public static String dataFormat(Date date){
    	DateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		return format.format(date);
    }
}
