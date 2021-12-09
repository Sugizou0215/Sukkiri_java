import java.io.FileWriter;
import java.io.IOException;

public class Chapter_n17 {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello,world!");
		} catch(IOException e) {
			System.out.println("書き込みエラー:" + e.getMessage());
		} catch(NullPointerException e) {
			System.out.println("nullエラー:" + e.getMessage());
		} catch(Exception e) {
			System.out.println("何らかのエラー:" + e.getMessage());
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}		
		}
	}
	
	public static void subsub() throws IOException {
		FileWriter fw = new FileWriter("data.txt");
		fw.write("hello,world!");
		fw.close();
	}
}
