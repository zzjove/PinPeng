package ww_test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2012-03-01";
		Date date=sf.parse(strDate);
		
		System.out.println(sf.format(date));
	}

}
