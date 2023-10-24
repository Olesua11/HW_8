package kg.geeks.game.players;

public class Berserk extends Hero {
    private int blockedDamage;
    private boolean isRageActive = false;
    private int rageDuration = 0;
    private int rageDamage = 0;


    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
    }


    public int getBlockedDamage() {
        return blockedDamage;
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - this.blockedDamage);
        System.out.println("Berserk " + this.getName() + " reverted " + blockedDamage);
        if (!isRageActive) {
            isRageActive = true;
            rageDuration = 3;
            rageDamage = this.getDamage() * 2;
            System.out.println("Berserk " + this.getName() + " activated RAGE_ATTACK. Will deal double damage for the next 3 rounds.");
        } else {
            rageDuration--;
            if (rageDuration > 0) {
                boss.setHealth(boss.getHealth() - rageDamage);
                System.out.println("Berserk " + this.getName() + " deals RAGE_ATTACK damage: " + rageDamage);
            } else {
                isRageActive = false;
                System.out.println("Berserk " + this.getName() + " RAGE_ATTACK is over.");
            }
        }

    }
}