import java.util.HashMap;
import java.util.Map;

public class Chapter_n16p {
	public static void main(String[] args) {
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");
		
		Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 8);
		
		for (Hero key: heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵は" + value);
		}
	}

}
