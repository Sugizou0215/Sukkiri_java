
public class PoisonMatango extends Matango {
	
	int poisonCount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらいまた！");
			int damage = h.hp / 5;
			System.out.println(damage + "ポイントのダメージ！");
			h.hp -= damage;
			this.poisonCount -= 1;
		}
	}
}
