package com.bxit.lesson11.Practice;

public class TrainingGround {
    public static void main(String[] args) {
        Hero archer = new Archer("archer");
        Hero warrior = new Archer("warrior");
        Hero merge = new Archer("merge");
        Enemy enemy = new Enemy(250, "Zombie");
        attacks(enemy, warrior, merge, archer);
    }

    public static void attacks(Enemy enemy, Hero... heroes){
        while (enemy.isAlive()){
            for (Hero hero : heroes) {
                if (enemy.isAlive())
                    hero.attackEnemy(enemy);
            }
        }
    }
}
