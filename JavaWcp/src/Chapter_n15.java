

public class Chapter_n15 {
	public static void main(String[] args) {
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
	}
}
