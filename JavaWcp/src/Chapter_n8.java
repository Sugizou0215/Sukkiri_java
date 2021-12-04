
public class Chapter_n8 {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h1 = new Hero("ミナト");
		h1.sword = s;
		System.out.println("勇者" + h1.getName() + "を生み出しました！");
		System.out.println("現在の武器は" + h1.sword.name);
		System.out.println("HPは" + h1.getHp());
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		
		Hero h2 = new Hero("アサカ");
		
		Matango m1 = new Matango('A');
		m1.hp = 50;
		Matango m2 = new Matango('B');
		m2.hp = 50;
		
		Wizard w = new Wizard();
		w.setName("スガワラ");
		w.setHp(50);
		w.heal(h1);
		w.heal(h2);
		w.attack(m1);
		w.fireball(m2);
		
		SuperHero sh = new SuperHero();
		sh.run();
		
		h1.slip();
		h1.attack(m1);
		m1.run();
		m2.run();
		h1.run();
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String f = String.format(FORMAT, h1.getName(), h1.getHp(), Hero.money);
		System.out.println(f);
	}
}
