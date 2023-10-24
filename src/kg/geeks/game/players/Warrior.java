package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(9) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        System.out.println("Warrior " + this.getName() + " hits critically " + this.getDamage() * coeff);
        int originalDamage = this.getDamage();
        this.setDamage(originalDamage * 2);
        System.out.println(this.getName() + " doubled its damage for one turn.");
        this.setDamage(originalDamage);
    }
}
