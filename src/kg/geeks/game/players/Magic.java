package kg.geeks.game.players;

public class Magic extends Hero {
    private int attackBoost;
    private int attackBoostPerRound;

    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
        this.attackBoostPerRound = attackBoostPerRound;
        this.attackBoost = 10;
    }



    @Override


    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - this.getDamage());
        System.out.println("Magic " + this.getName() + " used MAGIC_ATTACK and dealt " + this.getDamage() + " damage to the boss.");
        attackBoost += attackBoostPerRound;
        System.out.println("Magic " + this.getName() + " increased the attack of all heroes for the next round.");

    }

}

