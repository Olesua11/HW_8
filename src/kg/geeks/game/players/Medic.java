package kg.geeks.game.players;

import jdk.internal.icu.text.UnicodeSet;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String name, int healPoints) {
        super(health, damage, name, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }
    public void sacrifice(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0) {
                // Воскрешаем первого павшего героя
                heroes[i].setHealth(1);
                System.out.println("Medic " + this.getName() + " uses Sacrifice to resurrect a fallen hero.");
                // Пожертвовать своей жизнью
                this.setHealth(0);
                break;
            }
        }
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);
            }
        }
    }
}