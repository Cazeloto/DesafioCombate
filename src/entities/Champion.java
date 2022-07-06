package entities;

public class Champion {

	private String name;
	private int life, attack, armor;

	public Champion() {

	}

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion ch1, Champion ch2) {
		if (ch1.getArmor() > ch2.getAttack()) {
			ch1.setLife(ch1.getLife() - 1);
		} else {
			int newLife1 = ch1.getLife() - ch2.getAttack() + ch1.getArmor();
			if (newLife1 <= 0) {
				ch1.setLife(0);
			} else {
				ch1.setLife(newLife1);
			}

		}
	}

	public String Status(Champion ch1) {
		
		String status1 = "   ";
		if (ch1.getLife() ==  0) {
			status1 = ("0 VIDAS RESTANTES - morreu");
		} else {
			status1 = (ch1.getLife() + " VIDAS RESTANTES");
		}
		
		return status1;
	}

	@Override
	public String toString() {
		return "Champion [name=" + name + ", life=" + life + ", attack=" + attack + ", armor=" + armor + "]";
	}

}