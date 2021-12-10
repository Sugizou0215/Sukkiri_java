
public class Chapter_n17p {
	public static void main(String[]args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("NullPointException例外をcatchしました");
			System.out.println("---スタックトレース（ここから）---");
			e.printStackTrace();
			System.out.println("---スタックトレース（ここまで）---");
		}
		
		try {
			int i = Integer.parseInt("三");
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("NumerFormatException例外をcatchしました");
		}
	}

}
