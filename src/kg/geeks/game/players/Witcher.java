package kg.geeks.game.players;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.RESURRECTION);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() <= 0) {
                hero.setHealth(50);
                System.out.println("Witcher " + this.getName() + " uses Resurrection to bring a fallen hero back to life: " + hero.getName());
                this.setHealth(0);
                break;
            }
        }
    }
}
