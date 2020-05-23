
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import bsh.ParseException;

public class DateString {

	public static void main(String[] args)throws ParseException, java.text.ParseException {
		// TODO Auto-generated method stub
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy"); 
		 * Date today = new Date(); 
		 * // Date date = sdf.parse("26/06/1981"); 
		 * String date =sdf.format(today); 
		 * System.out.println(date);
		 */
		 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		 String months[] = {"January","February","March","April","May","June"};
		 Date date = df.parse("31/03/2020");
		 String dat = df.format(date);
		 System.out.println(dat);
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		 int day = cal.get(Calendar.DAY_OF_MONTH);
		 int month = cal.get(Calendar.MONTH);
		 int year = cal.get(Calendar.YEAR);
		 System.out.println(day);
		 System.out.println(months[month]);
		 System.out.println(year);
		 
		 
			
	}

}
