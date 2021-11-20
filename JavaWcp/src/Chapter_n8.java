
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
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		Matango m2 = new Matango();
		m2.hp = 50;
		m2.suffix = 'B';
		
		h1.slip();
		h1.attack();
		m1.run();
		m2.run();
		h1.run();
		
	}
}
