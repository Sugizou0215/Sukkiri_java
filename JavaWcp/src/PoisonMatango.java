
public class PoisonMatango extends Matango {
	
	int poisonCount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらいまた！");
			System.out.println(h.hp / 5 + "ポイントのダメージ！");
			h.hp -= h.hp / 5;
			poisonCount -= 1;
		}
	}
}
