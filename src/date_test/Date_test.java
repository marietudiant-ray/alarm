package date_test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_test {
	
	public static void main(String[] args)
	{
		Date deadline=new Date();
		/*SimpleDateFormat simpledateformat=new SimpleDateFormat(" E yyyy.mm.dd 'at' hh:mm:ss a zzz");
		System.out.println(simpledateformat.format(date));*/
		/*System.out.println(date);
		
		
		String[] s=date.toString().split(" ");
		for(String str: s)
		{
			System.out.println(str);
		}*/
		Date birthday=new Date();
	    deadline=birthday;
	    System.out.println(deadline==birthday);
	}
}
