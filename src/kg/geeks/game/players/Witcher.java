package kg.geeks.game.players;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.RESURRECTION);
    }

    public void resurrection(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0) {
                heroes[i].setHealth(1);
                System.out.println("Witcher " + this.getName() + " uses Resurrection to bring a fallen hero back to life.");
                this.setHealth(0);
                break;
            }
        }
    }

    @Override
    public void attack(Boss boss) {
        System.out.println("Witcher " + this.getName() + " does not attack the boss.");
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}
