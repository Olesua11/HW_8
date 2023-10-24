
package kg.geeks.game.players;

public class Thor extends Hero {
    private double stunChance;

    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
        this.stunChance = stunChance;
    }

    public void stunBoss(Boss boss) {
        if (Math.random() < stunChance) {
            boss.setStunned(true);
            System.out.println("Thor successfully stunned the boss for 1 round!");
        }
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        stunBoss(boss);
    }
}
