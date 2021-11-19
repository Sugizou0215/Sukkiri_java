
public class Chapter_n5 {
	public static void main(String[] args) {
		introduceOneself();
		email("挨拶", "sample@gmail.com", "こんにちわ");
		email("sample@gmail.com", "こんにちわ");
		calcTriangleArea(10.0, 5.0);
		calcCircleArea(5.0);
	}
	
	public static void introduceOneself() {
		String name = "スギ";
		int age = 31;
		double height = 1.65;
		char eto = '午';
		System.out.println("氏名：" + name);
		System.out.println("年齢：" + age);
		System.out.println("身長：" + height);
		System.out.println("干支：" + eto);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下の内容でメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に以下の内容でメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static void calcTriangleArea(double bottom, double height) {
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + (bottom * height / 2) + "㎠");
	}
	
	public static void calcCircleArea(double radius) {
		System.out.println("円の半径が" + radius + "cmの場合、面積は" + (radius * radius * 3.14) + "㎠");
	}

}
