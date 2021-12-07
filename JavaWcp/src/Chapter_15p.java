import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Chapter_15p {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i+1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
		System.out.println(a);
		
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));
	}
	
	public String concatPath(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}

}
