
public class Hero {
	private String name;
	private int hp;
	Sword sword;
	static int money = 100;
	
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "は" + sword.name + "で攻撃した！");
		m.hp -= 5;
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	
	public void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAMEOVERです");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		} else if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		} else if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String toString() {
		return "名前：" + this.name + "HP：" + this.hp;
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Hero) {
			Hero h = (Hero)o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	public Hero() {
		this("ダミー");
	}
}
