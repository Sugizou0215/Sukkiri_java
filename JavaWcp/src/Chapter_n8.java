
public class Chapter_n8 {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h1 = new Hero("ミナト");
		h1.sword = s;
		System.out.println("勇者" + h1.name + "を生み出しました！");
		System.out.println("現在の武器は" + h1.sword.name);
		System.out.println("HPは" + h1.hp);
		
		Hero h2 = new Hero("アサカ");
		
		Matango m1 = new Matango('A');
		m1.hp = 50;
		Matango m2 = new Matango('B');
		m2.hp = 50;
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
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
		
	}
}
