import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Chapter_n15 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		Calendar c = Calendar.getInstance();
		c.set(2021, 12, 5, 13, 3, 5);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year + "年" + month + "月" + day +  "日" + hour + "時" + minute + "分" + second + "秒");
		
		Instant i1 = Instant.now();
		Instant i2 = Instant.ofEpochMilli(160070542827L);
		long l = i2.toEpochMilli();
		
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("europe/London"));
		
		System.out.println("東京" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
		
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9 ,5, 0, 0);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
		
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		LocalDate now1 = LocalDate.now();
		if (now1.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
		}
		
		long start = System.currentTimeMillis();
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		
		System.out.println("s1の長さは" + s1.length() + "です");
		
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
		
		String s4 = "Java and Javascript";
		
		if (s4.contains("Java")) {
			System.out.println("文字列s4は、Javaを含んでいます");
		}
		
		if (s4.endsWith("Java")) {
			System.out.println("文字列s4は、Javaが末尾にあります");
		}
		
		System.out.println("文字列s4で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s4で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		
		String s5 = "Java programming";
		System.out.println("文字列s5の4文字目以降は" + s5.substring(3));
		System.out.println("文字列s5の4～8文字目は" + s5.substring(3,8));
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s6 = sb.toString();
		System.out.println(s6);
		
		String s7 = "abc,def:ghi";
		String[] words = s7.split("[,:]");
		for (String w : words) {
			System.out.println(w + "=>");
			
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");
		}
	}
}
