import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Chapter_n16 {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}
		
		Iterator<Integer> it = points.iterator();
		while (it.hasNext()) {
			Integer e = it.next();
			System.out.println(e);
		}
		
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("黄");
		colors.add("青");
		System.out.println("色は" + colors.size() + "種類");
		for (String s :colors) {
			System.out.print(s + "→");
		}
		
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s2 :words) {
			System.out.print(s2 + "→");
		}
	}

}
