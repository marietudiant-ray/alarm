package date_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class Date_Before_After {
	
	
	public static String formatDate(Date date)
	{
		SimpleDateFormat simpledateformat=new SimpleDateFormat("yyyy-MM-dd");
		return simpledateformat.format(date);
	}
	
	public static Date parseDate(String strdate) throws ParseException
	{
		SimpleDateFormat simpledateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return simpledateformat.parse(strdate);
	}
	public static void main(String[] args) throws ParseException
	{
		//Date birthday=new Date();
		//Calendar calendar=Calendar.getInstance();
		//birthday=java.sql.Date.valueOf("1990-12-14");
		//SimpleDateFormat simpledate=new SimpleDateFormat("mm-dd");
		
	   /* birthday=java.sql.Date.valueOf("1990-12-14");//java.sql.Date.valueOf(String str);//其中是字符串类型
	    *///System.out.println(birthday);
       // SimpleDateFormat simpledate=new SimpleDateFormat("MM-dd");
        //SimpleDateFormat simpledate1=new SimpleDateFormat("mm-dd");
        // please Pay attention on the format of the date, particularly on the upper or lower cases. 
        // you need to see these two different formats of date and their results.
        //String s=simpledate.format(birthday);// right written with upper case on Month 
        //String s1=simpledate1.format(birthday);// wrong written with lower case on Month
        //System.out.println(s+"\n"+s1);// you found the different output of months.
	   
		/*Date date=new Date();
	    String str=new String("1990-12-14");
	    date=parseDate(str);
	    Calendar calendar=Calendar.getInstance();
	    Date today=new Date();
	    today=calendar.getTime();
	    //JOptionPane.showMessageDialog(null,today.toString());
	    System.out.println(Calendar.DECEMBER);*/
		
		Calendar calendar=Calendar.getInstance();
		/*System.out.println(calendar.get(calendar.AM_PM));
		System.out.println(calendar.get(calendar.DAY_OF_WEEK));// 0 represent before noon 
		                                                 // 1 represent after noon
		System.out.println(calendar.getFirstDayOfWeek()==Calendar.SUNDAY);*/
	   /* String str=new String("1990-12-14   11:12:30");
	    Date date=parseDate(str);
	    calendar.setTime(date);
	    System.out.println(calendar.getTime());*/
		//calendar.set(1990, 11, 14, 11, 12, 30);// you need to pay attention that January=0 hence December=11, if you 
		                                       // type in month=12,you will got January in the next year
		//String str=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(calendar.getTime()));
		//System.out.println(calendar.get(calendar.MILLISECOND));
		calendar.add(Calendar.MINUTE, 5);
		System.out.println(calendar.getTime());
	}

}
